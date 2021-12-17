package FunctionalInterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import data.Student;
import data.Studentdatabase;

public class PredicateConsumerExample {

	static List<Student> students = Studentdatabase.getAllStudents();

	Predicate<Student> p1 = s -> s.getGradeLevel() >= 3;
	Predicate<Student> p2 = s -> s.getGpa() >= 3.9;

	BiPredicate<Integer, Double> biPredicate = (a, b) -> a >= 3 && b >= 3.9;

	BiConsumer<String, List<String>> studentBic = (n, a) -> {
		System.out.println("name - " + n + " || activities - " + a);
	};

	Consumer<Student> studentC = s -> {
		/*
		 * if (p1.and(p2).test(s)) { studentBic.accept(s.getName(), s.getActivities());
		 * }
		 */

		if (biPredicate.test(s.getGradeLevel(), s.getGpa())) {
			studentBic.accept(s.getName(), s.getActivities());
		}
	};

	public void printNameActivities(List<Student> list) {
		list.forEach(studentC);
	}

	public static void main(String[] args) {
		new PredicateConsumerExample().printNameActivities(students);
	}

}
