package java8forprofessionals.ch3;

public class TransformCamelCase implements WordTransformable {
	public String transformCamelCase(String input) {
		String[] inArr = input.split(" ");
		StringBuilder result = new StringBuilder();
		for(String in: inArr) {
			result.append(in.substring(0, 1).toUpperCase() + in.substring(1));
		}
		return result.toString();
	}
}
