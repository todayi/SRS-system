package mysqlDao.demo;

import java.util.List;

import dao.demo.FacultyDao;
import dao.demo.ProfessorDao;
import dao.demo.dataAccess;
import model.demo.Faculty;
import model.demo.Professor;

public class FacultyImpl implements FacultyDao {
	
	@Override
	public Faculty getFaculty() {
		Faculty faculty = new Faculty();
		ProfessorDao pd = dataAccess.createProfessorDao();
		List<Professor> professors = pd.getAllProfessors();
		for (Professor p : professors) {
			faculty.addProfessor(p);
		}
		return faculty;
	}
}
