package courseExample.business;

import java.util.ArrayList;
import java.util.List;

import courseExample.core.logging.Logger;
import courseExample.dataAccess.CategoryDao;
import courseExample.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	List<String> categories = new ArrayList<>();
	
	public void add(Category category) throws Exception {
		if(categories.contains(category.getName())) {
			throw new Exception ("this category already exist.");
		}
		for (Logger logger : loggers) {
			logger.sendLog(category.getName());
		}
		
			categories.add(category.getName());
			categoryDao.add(category);
		
	}
}
