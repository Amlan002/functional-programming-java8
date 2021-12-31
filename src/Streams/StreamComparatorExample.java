package Streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.Studentdatabase;

public class StreamComparatorExample {
	static List<Student> students = Studentdatabase.getAllStudents();

	public static List<Student> sortstudentByName(){
		return students.stream().sorted(Comparator.comparing(Student::getName))
			.collect(Collectors.toList());
		
	}
	
	public static List<Student> sortstudentByGpa(){
		return students.stream().sorted(Comparator.comparing(Student::getGpa))
			.collect(Collectors.toList());
		
	}
	
	public static List<Student> sortstudentByGpaDesc(){
		return students.stream().sorted(Comparator.comparing(Student::getGpa).reversed())
			.collect(Collectors.toList());
		
	}
	
	public static void main(String[] args) {
		System.out.println("=======Sorted by name");
		sortstudentByName().forEach(System.out::println);
		System.out.println("=======Sorted by gpa");
		sortstudentByGpa().forEach(System.out::println);
		System.out.println("=======Sorted by gpa desc");
		sortstudentByGpaDesc().forEach(System.out::println);

	}

}
