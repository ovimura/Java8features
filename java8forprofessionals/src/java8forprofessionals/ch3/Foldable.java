package java8forprofessionals.ch3;

public interface Foldable {
	static void printFoldInstructions() {
		System.out.println("Carefuly fold the object.");
	}
	
	default void fold() {
		System.out.println("Folding the object.");
	}
}
