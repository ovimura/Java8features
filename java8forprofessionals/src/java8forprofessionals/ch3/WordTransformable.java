package java8forprofessionals.ch3;

public interface WordTransformable {
	default String transformTextCamelCase(String input) {
		return input;
	}
	
	default String transformScreamingSnakeCaseText(String input) {
		return input;
	}
}
