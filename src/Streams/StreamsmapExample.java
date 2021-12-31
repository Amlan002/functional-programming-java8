package Streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import data.Student;
import data.Studentdatabase;

public class StreamsmapExample {

	static List<Student> students = Studentdatabase.getAllStudents();

	public static List<String> nameList() {
		return students.stream().map(Student::getName).map(String::toUpperCase).collect(Collectors.toList());
	}
	
	public static Set<String> nameSet() {
		return students.stream().map(Student::getName).map(String::toUpperCase).collect(Collectors.toSet());
	}

	public static void main(String[] args) {
		System.out.println("==================name list");
		nameList().forEach(System.out::println);
		System.out.println("==================name set");
		nameSet().forEach(System.out::println);
		
	}

}
