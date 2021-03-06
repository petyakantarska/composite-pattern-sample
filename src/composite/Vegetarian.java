package composite;

import java.util.ArrayList;
import java.util.List;

public class Vegetarian implements Meal {
	private String name = "--- Vegetarian: ";	
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
