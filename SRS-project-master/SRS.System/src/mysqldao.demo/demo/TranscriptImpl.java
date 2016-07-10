package mysqlDao.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dao.demo.TranscriptDao;
import model.demo.Course;
import model.demo.Professor;
import model.demo.Section;
import model.demo.Student;
import model.demo.Transcript;
import model.demo.TranscriptEntry;
import util.java.DBUtil;

public class TranscriptImpl implements TranscriptDao {
	@Override
	public Transcript getTranscriptByStudent(Student student) {
		String Sssn = student.getSsn();
		Connection Conn = DBUtil.getMySqlConnection();
		String sql = "select * from TranscriptEntry,Section,Course,Professor where TranscriptEntry.sectionNo=Section.sectionNo and Section.courseNo=Course.courseNo and Section.Pssn=Professor.Pssn and TranscriptEntry.Sssn='" + Sssn + "'";
		Transcript t = new Transcript(student);
		try {
			PreparedStatement pstmt = Conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int transEntryNo = rs.getInt("transEntryNo");
				Course course=new Course(rs.getString("courseNo"),rs.getString("courseName"),rs.getDouble("credits"));
				Section section = new Section(rs.getInt("sectionNo"),rs.getString("dayOfWeek"),rs.getString("timeOfDay"),course,rs.getString("room"),rs.getInt("seatingCapacity"));
				Professor professor = new Professor(rs.getString("professorName"),rs.getString("Pssn"),rs.getString("title"),rs.getString("department"));
				section.setInstructor(professor);
				
				String gradeReceived = rs.getString("gradeReceived");
				TranscriptEntry te = new TranscriptEntry(transEntryNo,student,gradeReceived,section);
				t.addTranscriptEntry(te);
			}
			rs.close();
			pstmt.close();
			Conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return t;
	}
}
