package FunctionalInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import data.Student;
import data.Studentdatabase;

public class FunctionExample {

	static List<Student> students = Studentdatabase.getAllStudents();

	static Function<String, String> function1 = (n) -> n.toUpperCase();
	static Function<String, String> addSomeString = (n) -> n.toUpperCase().concat(" default");

	static Function<List<Student>, Map<String, Double>> studentFunction = (students -> {

		Map<String, Double> studentGrademap = new HashMap();
		students.forEach((student -> {
			if (PredicateStudentExample.p1.test(student)) {
				studentGrademap.put(student.getName(), student.getGpa());
			}

		}));
		return studentGrademap;

	});

	public static void main(String[] args) {
		System.out.println("result of function is -" + function1.apply("amlan"));
		System.out.println("result of andthen is -" + function1.andThen(addSomeString).apply("amlan"));
		System.out.println("result of compose is -" + function1.compose(addSomeString).apply("amlan"));
		System.out.println(studentFunction.apply(students));

	}

}
