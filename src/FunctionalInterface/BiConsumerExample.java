package FunctionalInterface;

import java.util.List;
import java.util.function.BiConsumer;

import data.Student;
import data.Studentdatabase;

public class BiConsumerExample {

	static BiConsumer<String, List<String>> biConsumer = (name, act) -> System.out
			.println("Name " + name + " ||Activities" + act);

	public static void getNameActivities() {
		List<Student> students = Studentdatabase.getAllStudents();
		students.forEach(s -> biConsumer.accept(s.getName(), s.getActivities()));
	}

	public static void main(String[] args) {

		BiConsumer<String, String> biConsumer = (a, b) -> System.out.println("a value -" + a + " || b value -" + b);
		biConsumer.accept("Amlan", "Arpita");

		BiConsumer<Integer, Integer> multiply = (x, y) -> System.out
				.println("Multiplication of " + x + " and " + y + " is " + (x * y));
		// multiply.accept(50, 90);

		BiConsumer<Integer, Integer> division = (x, y) -> System.out
				.println("Divions of " + x + " and " + y + " is " + (x / y));
		// division.accept(500, 90);

		multiply.andThen(division).accept(10, 3);

		getNameActivities();
	}

}
