package java8forprofessionals.ch3;

public class Challenge {
	public static void main(String[] args) {
		TransformCamelCase t1 = new TransformCamelCase();
		TransformScreamingSnakeCase t2 = new TransformScreamingSnakeCase();
		System.out.println(t1.transformCamelCase("This is test"));
		System.out.println(t2.transformScreamingSnakeCaseText("This is test"));
	}
}
