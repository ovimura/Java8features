package java8forprofessionals.ch3;

public class TransformScreamingSnakeCase implements WordTransformable {
	public String transformScreamingSnakeCaseText(String input) {
		String[] inArr = input.split(" ");
		StringBuilder result = new StringBuilder();
		for(String in: inArr) {
			result.append(in.toUpperCase() + "_");
		}
		String result_string = result.toString();
		return result_string.substring(0, result_string.length()-1);
	}
}
