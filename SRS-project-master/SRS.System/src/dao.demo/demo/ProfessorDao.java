package dao.demo;

import java.util.List;

import model.demo.Professor;
import model.demo.Section;

public interface ProfessorDao {
	List<Professor> getAllProfessors();
	Professor getProfessor(String Pssn);
	List<Section> getSectionTeached(Professor professor);
	void addProfessor(Professor professor);
	void deleteProfessor(String Pssn);
	void updateProfessor(Professor professor);
	void teachSection(Professor professor, Section section);
}
