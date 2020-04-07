package composite;

public interface Meal {
	void add(Meal meal);
	
	String getName();
	String prepareTime();
	
	void printMeals();
}
