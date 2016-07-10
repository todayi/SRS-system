package service.com;

import dao.demo.ProfessorWithPasswordDao;
import dao.demo.StudentWithPasswordDao;
import dao.demo.dataAccess;
import model.demo.ProfessorWithPassword;
import model.demo.StudentWithPassword;

public class UserService {
	public StudentWithPassword getStudentWithPassword(String sssn){
		StudentWithPasswordDao spd=dataAccess.createStudentWithPasswordDao();
		StudentWithPassword sp=spd.getStudentWithPassword(sssn);
		return sp;
	}
	
	public ProfessorWithPassword getProfessorWithPassword(String pssn){
		ProfessorWithPasswordDao ppd=dataAccess.createProfessorWithPasswordDao();
		ProfessorWithPassword pp=ppd.getProfessorWithPassword(pssn);
		return pp;
	}
}
