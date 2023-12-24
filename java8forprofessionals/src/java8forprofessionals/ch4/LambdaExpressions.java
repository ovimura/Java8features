package java8forprofessionals.ch4;

public class LambdaExpressions {
	public static void main(String [] args) {
		Calculator c1 = (a, b) -> a + b;
		Calculator c2 = (double a, double b) -> { return a + b; };
		Calculator c3 = (a, b) -> a + b ;
		System.out.println(c1.calc(1, 2));
		System.out.println(c2.calc(1, 2));
		System.out.println(c2.calc(3, 4));
		
		Creator theCreator = () -> "Hello World!";
		
		System.out.println(theCreator.create());
		
		Tester theTester1 = s -> s.length() > 5;
		
		System.out.println(theTester1.test("Mura Ovidiu"));
		String t = "aaa";
		Tester theTester2 = s -> {
			String ss = s.substring(0, s.length()-2);
			char c = t.charAt(0);
			System.out.println(c);
			if(ss.length() == s.length())
				return true;
			else
				return false;
		};
		
		System.out.println(theTester2.test("abcde"));
		
	}
}


