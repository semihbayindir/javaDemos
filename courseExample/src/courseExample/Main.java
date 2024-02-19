package courseExample;

import courseExample.business.CategoryManager;
import courseExample.business.CourseManager;
import courseExample.business.InstructorManager;
import courseExample.dataAccess.HibernateDao;
import courseExample.dataAccess.JdbcDao;
import courseExample.entities.Category;
import courseExample.entities.Course;
import courseExample.entities.Instructor;
import courseExample.core.logging.*;

public class Main {

	public static void main(String[] args) throws Exception {
		Category category = new Category(1,"category-1");
		Logger[] loggers ={new FileLogger(),new MailLogger(),new DatabaseLogger()};
		
		CategoryManager categoryManager = new CategoryManager(new HibernateDao(), loggers);
		categoryManager.add(category);
		
		Course course = new Course(1,"course-1",100);
		
		CourseManager courseManager = new CourseManager(new JdbcDao(), loggers);
		courseManager.add(course);
		
		Instructor instructor = new Instructor(1,"instructor-1");
		
		InstructorManager instructorManager = new InstructorManager(new HibernateDao(), loggers);
		instructorManager.add(instructor);
		
	}

}
