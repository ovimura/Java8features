package java8forprofessionals.ch4;

public class Challenge {

	public static void main(String[] args) {
		Actionable PrintHelloWorld = () -> System.out.println("Hello World!");
		PrintHelloWorld.run();
		
		StringMappable StringToUpperCase = (String s) -> { return s.toUpperCase(); };
		
		printHelloWorldMapped((s)-> s.toUpperCase(), "Hello World!" );
	}
	

	public static void printHelloWorldMapped(StringMappable m, String text) {
		System.out.println(m.mapString(text));
	}
	
}
