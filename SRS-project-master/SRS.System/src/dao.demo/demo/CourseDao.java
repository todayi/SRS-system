package dao.demo;

import java.util.List;

import model.demo.Course;
import model.demo.Section;

public interface CourseDao {
	List<Course> getAllCourses();
	Course getCourse(String courseNo);
	List<Section> getAllOfferedAsSection(Course course);
	List<Course> getPrerequisites(Course course);
	void addCourse(Course course,String preCourseNo);
	void deleteCourse(String courseNo);
	void updateCourse(Course course);
	void addPrerequisite(String courseNo, String preCourseNo);
	void updatePrerequisite(Course course, String preCourseNo);
}
