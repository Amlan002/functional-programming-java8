package Streams.terminal;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import data.Student;
import data.Studentdatabase;

public class StreamMinMax {
	
	public static Optional<Student> minBy(){
		return Studentdatabase.getAllStudents().stream()
			.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}
	
	public static Optional<Student> maxBy(){
		return Studentdatabase.getAllStudents().stream()
			.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
	}

	public static void main(String[] args) {
		System.out.println("Min by gpa "+minBy().get());
		System.out.println("Max by gpa "+maxBy().get());

	}

}
