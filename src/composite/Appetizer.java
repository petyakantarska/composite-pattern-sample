package composite;

import java.util.ArrayList;
import java.util.List;

public class Appetizer implements Meal {
	private String name = "Appetizers: ";	
	private List<Meal> meals = new ArrayList<Meal>();
	
	@Override
	public void add(Meal meal) {
		meals.add(meal);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String prepareTime() {
		return "";
	}

	@Override
	public void printMeals() {
		System.out.println(name);
		for(Meal meal: meals) {
			meal.printMeals();
		}
	}
}
