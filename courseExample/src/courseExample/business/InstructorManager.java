package courseExample.business;

import courseExample.core.logging.Logger;
import courseExample.dataAccess.InstructorDao;
import courseExample.entities.Instructor;

public class InstructorManager {
	InstructorDao instructorDao;
	Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for (Logger logger : loggers) {
			logger.sendLog(instructor.getName());
		}
	}
}
