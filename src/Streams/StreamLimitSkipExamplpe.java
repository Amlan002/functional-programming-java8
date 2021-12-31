package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import data.Student;
import data.Studentdatabase;

public class StreamLimitSkipExamplpe {
	static List<Student> students = Studentdatabase.getAllStudents();
	
	public static Optional<Integer> limit(List<Integer> intL){
		return intL.stream().limit(2).reduce((x,y)->x+y);
	}

	public static Optional<Integer> skip(List<Integer> intL){
		return intL.stream().skip(2).reduce((x,y)->x+y);
	}

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(7, 3, 5, 2, 9, 10, 38, 21);

		System.out.println("Addition of first 2 number "+limit(integers).get());
		System.out.println("Addition, excluding first 2 number "+skip(integers).get());

	}

}
