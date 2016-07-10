package dao.demo;

import java.util.List;

import model.demo.Section;
import model.demo.Student;

public interface StudentDao {
	List<Student> getAllStudents();
	Student getStudent(String Sssn);
	List<Section> getEnrolledSections(Student student);
	void addStudent(Student student);
	void deleteStudent(Student student);
	void updateStudent(Student student);
	void addEnrolledSection(Student student, int sectionNo);
	void dropEnrolledSection(Student student, int sectionNo);
}
