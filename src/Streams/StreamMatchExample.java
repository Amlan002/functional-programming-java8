package Streams;

import java.util.List;

import data.Student;
import data.Studentdatabase;

public class StreamMatchExample {
	static List<Student> students = Studentdatabase.getAllStudents();

	public static boolean allMatch() {

		return students.stream().allMatch(s -> s.getGpa() >= 3.5);
	}

	public static boolean anyMatch() {

		return students.stream().anyMatch(s -> s.getGpa() >= 4.0);
	}
	
	public static boolean noneMatch() {

		return students.stream().noneMatch(s -> s.getGpa() >= 46.0);
	}

	public static void main(String[] args) {
		System.out.println("result of all match " + allMatch());
		System.out.println("result of any match " + anyMatch());
		System.out.println("result of non match " + noneMatch());
	}

}
