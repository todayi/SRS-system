package dao.demo;

import model.demo.ProfessorWithPassword;

public interface ProfessorWithPasswordDao {
	ProfessorWithPassword getProfessorWithPassword(String Pssn);

	void updatePasswordOfProfessor(String Pssn, String pwd);
}
