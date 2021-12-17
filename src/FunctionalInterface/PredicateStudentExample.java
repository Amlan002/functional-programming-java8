package FunctionalInterface;

import java.util.List;
import java.util.function.Predicate;

import data.Student;
import data.Studentdatabase;

public class PredicateStudentExample {

	static List<Student> students = Studentdatabase.getAllStudents();
	static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
	static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

	public static void filterstudentByGrade() {
		students.forEach((x) -> {
			if (p1.test(x)) {
				System.out.println("filterstudentByGrade--Student name -" + x.getName());
			}
		});
	}

	public static void filterstudentByGpa() {
		students.forEach((x) -> {
			if (p2.test(x)) {
				System.out.println("filterstudentByGpa--Student name -" + x.getName());
			}
		});
	}

	public static void filterstudentByGradeAndGpa() {
		students.forEach((x) -> {
			if (p1.and(p2).test(x)) {
				System.out.println("filterstudentByGradeAndGpa--Student name -" + x.getName());
			}
		});
	}
	
	public static void main(String[] args) {
		filterstudentByGrade();
		System.out.println("=================================================");
		filterstudentByGpa();
		System.out.println("=================================================");
		filterstudentByGradeAndGpa();
	}

}
