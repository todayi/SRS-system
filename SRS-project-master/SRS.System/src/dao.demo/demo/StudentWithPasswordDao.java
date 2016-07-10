package dao.demo;

import model.demo.StudentWithPassword;

public interface StudentWithPasswordDao {
	StudentWithPassword getStudentWithPassword(String Sssn);

	void updatePasswordOfStudent(String Sssn, String pwd);
}
