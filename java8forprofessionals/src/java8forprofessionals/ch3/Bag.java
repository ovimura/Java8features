package java8forprofessionals.ch3;

public class Bag implements Foldable, Washable {
	public static void main(String[] args) {
		Foldable.printFoldInstructions();
	}
	
	public void fold() {
		System.out.println("Folding bag");
	}
	
	static {
		int i = 3;
		System.out.println(i);
		System.out.println("This is a static block.");
	}
}
