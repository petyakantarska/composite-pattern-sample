package composite;

public class Pizza implements Meal {
	private String name;
	private String prepareTime;
	
	public Pizza(String name, String prepareTime) {
		this.name = name;
		this.prepareTime = prepareTime;
	}
	
	@Override
	public void add(Meal meal) {
		// Leaf node
	}

	@Override
	public String getName() {		
		return name;
	}

	@Override
	public String prepareTime() {
		return prepareTime;
	}

	@Override
	public void printMeals() {
		System.out.println(name + " - " + prepareTime);
	}
}
