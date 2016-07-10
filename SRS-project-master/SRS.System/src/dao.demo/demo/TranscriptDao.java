package dao.demo;

import model.demo.Student;
import model.demo.Transcript;

public interface TranscriptDao {
	Transcript getTranscriptByStudent(Student student);
}
