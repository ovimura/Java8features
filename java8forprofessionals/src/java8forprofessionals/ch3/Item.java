package java8forprofessionals.ch3;

public class Item implements Foldable, Washable {
	String name;
	
	public Item() {
		super();
//		this("n");
	}
	
	public Item(String name) {
		this.name = name;		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void fold() {
		System.out.println("Folding " + name);
	}
	
	public static void main(String[] args) {
		Foldable.printFoldInstructions();
		Item item = new Item("Jeans");
		item.fold();
	}
}
