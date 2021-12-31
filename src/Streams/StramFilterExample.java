package Streams;

import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.Studentdatabase;

public class StramFilterExample {

	static List<Student> students = Studentdatabase.getAllStudents();
	
	public static List<Student> filterStudent(){
		return students.stream().filter(x->x.getGender().equals("female")).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println("=====list opf female student");
		filterStudent().forEach(System.out::println);
	}

}
