package courseExample.dataAccess;

import courseExample.entities.Category;
import courseExample.entities.Course;
import courseExample.entities.Instructor;

public class JdbcDao implements CategoryDao, CourseDao, InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor Jdbc with added");
	}

	@Override
	public void add(Course course) {
		System.out.println("Course Jdbc with added");
	}

	@Override
	public void add(Category category) {
		System.out.println("Category Jdbc with added");
	}

}
