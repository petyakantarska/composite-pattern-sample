package composite;

public class CompositeMain {
	public static void main(String[] args) {
		Pizza pizza1 = new Pizza("Margherita", "30 min"); 
		Pizza pizza2 = new Pizza("Frutti di Mare", "20 min"); 
		Pizza pizza3 = new Pizza("Americana", "40 min"); 
		
		Risotto risotto1 = new Risotto("Carnaroli", "1 hour"); 
		Risotto risotto2 = new Risotto("Arborio", "50 min"); 
		Risotto risotto3 = new Risotto("Vialone Nano", "35 min"); 
		Risotto risotto4 = new Risotto("Mushroom risotto", "25 min"); 
		
		Vegetarian vegetarian = new Vegetarian();
		vegetarian.add(pizza1);
		vegetarian.add(risotto4);
		
		NonVegetarian nonVegetarian = new NonVegetarian(); 
		nonVegetarian.add(pizza2);
		nonVegetarian.add(pizza3);		
		nonVegetarian.add(risotto1);
		nonVegetarian.add(risotto2);
		nonVegetarian.add(risotto3);
		
		Appetizer appetizer1 = new Appetizer(); 
		appetizer1.add(vegetarian);
		appetizer1.add(nonVegetarian);
		
		appetizer1.printMeals();
	}
}
