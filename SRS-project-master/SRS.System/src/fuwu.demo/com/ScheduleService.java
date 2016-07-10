package service.com;

import java.util.List;

import dao.demo.ScheduleOfClassesDao;
import dao.demo.dataAccess;
import json.demo.JSONArray;
import json.demo.JSONObject;
import model.demo.ScheduleOfClasses;
import model.demo.Section;

public class ScheduleService {
	public String getAllSchedules(String semester){
		JSONArray ja = new JSONArray();
		
		ScheduleOfClassesDao scd=dataAccess.createScheduleOfClassesDao();
		ScheduleOfClasses sc=scd.getScheduleOfClassess(semester);
		List<Section> sections=scd.getAllSectionsOffered(sc);
		
		for(Section s:sections){
			JSONObject jo=new JSONObject();
			jo.put("sectionNo", s.getSectionNo());
			jo.put("day", s.getDayOfWeek());
			jo.put("time",s.getTimeOfDay());
			jo.put("room", s.getRoom());
			jo.put("sCapacity", s.getSeatingCapacity());
			jo.put("courseName", s.getRepresentedCourse().getCourseName());
			jo.put("professor", s.getInstructor().getName());
			ja.put(jo);
		}
		return ja.toString();
	}
}
