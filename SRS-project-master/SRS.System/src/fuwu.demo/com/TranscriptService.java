package service.com;

import java.util.List;

import dao.demo.TranscriptDao;
import dao.demo.dataAccess;
import json.demo.JSONArray;
import json.demo.JSONObject;
import model.demo.Student;
import model.demo.Transcript;
import model.demo.TranscriptEntry;

public class TranscriptService {
	public String getTranscriptJSON(Student student){
		JSONArray ja = new JSONArray();

		TranscriptDao td=dataAccess.createTranscriptDao();
		Transcript transcript=td.getTranscriptByStudent(student);
		List<TranscriptEntry> transEntry=transcript.getTranscriptEntries();
		
		for (TranscriptEntry te : transEntry) {
			JSONObject jo = new JSONObject();
			jo.put("sectionNo", te.getSection().getSectionNo());
			jo.put("courseNo", te.getSection().getRepresentedCourse().getCourseNo());
			jo.put("courseName", te.getSection().getRepresentedCourse().getCourseName());
			jo.put("professorName", te.getSection().getInstructor().getName());
			jo.put("credits", te.getSection().getRepresentedCourse().getCredits());
			jo.put("grade", te.getGrade());
			ja.put(jo);
		}
		return ja.toString();
	}
}
