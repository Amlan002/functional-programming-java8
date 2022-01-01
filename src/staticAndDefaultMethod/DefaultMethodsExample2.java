package staticAndDefaultMethod;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import data.Student;
import data.Studentdatabase;

public class DefaultMethodsExample2 {

	static Consumer<Student> consumer=(s->System.out.println(s));
	static Comparator<Student> nameComparator=Comparator.comparing(Student::getName);
	static Comparator<Student> gpaComparator=Comparator.comparingDouble(Student::getGpa);
	static Comparator<Student> gradeComparator=Comparator.comparingDouble(Student::getGradeLevel);

	public static void sortByName(List<Student> s) {
		s.sort(nameComparator);
		s.forEach(consumer);
	}
	
	public static void sortByGpa(List<Student> s) {
		s.sort(gpaComparator);
		s.forEach(consumer);
	}
	
	public static void comparatorChanning(List<Student> s) {
		s.sort(gradeComparator.thenComparing(nameComparator));
		s.forEach(consumer);
	}
	
	public static void sortWithNullvalues(List<Student> s) {
		Comparator<Student> comparator= Comparator.nullsFirst(nameComparator);
		s.sort(comparator);
		s.forEach(consumer);
	}
	public static void main(String[] args) {
		List<Student> students = Studentdatabase.getAllStudents();
		
		System.out.println("Not sorted===========================");
		students.forEach(consumer);
		
		System.out.println("Sort by name===========================");
		sortByName(students);
		
		System.out.println("Sort by gpa===========================");
		sortByGpa(students);
		
		System.out.println("Compator chainning===========================");
		comparatorChanning(students);
		
		System.out.println("Sort tricks with null value ===========================");
		sortWithNullvalues(students);
	}

}
