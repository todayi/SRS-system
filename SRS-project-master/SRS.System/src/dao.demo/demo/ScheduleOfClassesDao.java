package dao.demo;

import java.util.List;

import model.demo.ScheduleOfClasses;
import model.demo.Section;

public interface ScheduleOfClassesDao {
	ScheduleOfClasses getScheduleOfClassess(String semester);
	List<Section> getAllSectionsOffered(ScheduleOfClasses schedule);
	void addScheduleOfClasses(ScheduleOfClasses schedule);
	void deleteScheduleOfClasses(ScheduleOfClasses schedule);
}
