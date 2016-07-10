package sqliteDao.demo;

import java.util.List;

import dao.demo.CourseCatalogDao;
import dao.demo.CourseDao;
import dao.demo.dataAccess;
import model.demo.Course;
import model.demo.CourseCatalog;

public class CourseCatalogImpl implements CourseCatalogDao {

	@Override
	public CourseCatalog getCourseCatalog() {
		CourseCatalog courseCatalog = new CourseCatalog();
		CourseDao cd = dataAccess.createCourseDao();
		List<Course> courses = cd.getAllCourses();
		for (Course c : courses) {
			courseCatalog.addCourse(c);
		}
		return courseCatalog;
	}

}
