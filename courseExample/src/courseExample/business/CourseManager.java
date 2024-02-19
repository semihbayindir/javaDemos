package courseExample.business;

import java.util.ArrayList;
import java.util.List;

import courseExample.core.logging.Logger;
import courseExample.dataAccess.CourseDao;
import courseExample.entities.Course;

public class CourseManager {
	CourseDao courseDao;
	Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	List<String> courses = new ArrayList<>();
	
	public void add(Course course) throws Exception {
		if(courses.contains(course.getName()) || course.getUnitPrice() < 0) {
			throw new Exception ("this course already exist // the price of course cannot be lower than 0");
		}
		for (Logger logger : loggers) {
			logger.sendLog(course.getName());
		}
		
			courses.add(course.getName());
			courseDao.add(course);
		
	}
}
