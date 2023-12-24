package java8forprofessionals.ch3;

public interface Washable {

	default void fold() {
		System.out.println("Folding fold object.");
	}
	
}
