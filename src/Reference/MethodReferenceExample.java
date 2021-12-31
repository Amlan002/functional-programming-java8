package Reference;

import java.util.function.Consumer;
import java.util.function.Function;

import data.Student;
import data.Studentdatabase;

public class MethodReferenceExample {

	static Function<String, String> toUpperCaselambda = s -> s.toUpperCase();
	static Function<String, String> toUpperCaseMethodRef = String::toUpperCase;

	static Consumer<Student> c1=p->System.out.println(p);
	static Consumer<Student> c2=System.out::println;
	static Consumer<Student> c3=Student::printActivities;
	
	public static void main(String[] args) {
		System.out.println("function Using lambda " + toUpperCaselambda.apply("Amlan"));
		System.out.println("function Using method ref " + toUpperCaseMethodRef.apply("Amlan"));
	
		System.out.println("consumer Using lambda ");
		Studentdatabase.getAllStudents().forEach(c1);
		
		System.out.println("consumer Using method reference ");
		Studentdatabase.getAllStudents().forEach(c2);
		
		System.out.println("consumer Using method reference only activities");
		Studentdatabase.getAllStudents().forEach(c3);
	}

}
