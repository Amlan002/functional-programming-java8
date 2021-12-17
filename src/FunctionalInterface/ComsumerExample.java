package FunctionalInterface;

import java.util.List;
import java.util.function.Consumer;

import data.Student;
import data.Studentdatabase;

public class ComsumerExample {
	static Consumer<Student> c2 = (s) -> System.out.println(s.getName());
	static Consumer<Student> c4 = (s) -> System.out.println(s.getActivities());
	public static void printName() {
		List<Student> students = Studentdatabase.getAllStudents();
		System.out.println("======================print name type 1");
		students.forEach(c2);
		//
		System.out.println("======================print name type 2");
		students.forEach((x) -> System.out.println(x.getName()));
	}

	public static void printActivites() {
		System.out.println("======================print activities type 1");
		List<Student> students = Studentdatabase.getAllStudents();
		students.forEach(c2.andThen(c4));// consumer chaining
	}
	
	public static void printActiviteswithgradeCondition() {
		System.out.println("======================print printActiviteswithgradeCondition type 1");
		List<Student> students = Studentdatabase.getAllStudents();
		students.forEach(s->{
			if(s.getGradeLevel()>=3) {
				c2.andThen(c4).accept(s);
			}
		});
	}

	public static void main(String[] args) {

		Consumer<String> c1 = (s) -> System.out.println("Upper case " + s.toUpperCase());
		c1.accept("Amlan");
		printName();
		printActivites();
		printActiviteswithgradeCondition();
	}

}
