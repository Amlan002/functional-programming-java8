package Streams.terminal;

import java.util.stream.Collectors;

import data.Student;
import data.Studentdatabase;

public class StreamSumAvg {
	
	public static int sum() {
		return Studentdatabase.getAllStudents().stream().collect(Collectors.summingInt(Student::getNoteBooks));
	}
	public static double avg() {
		return Studentdatabase.getAllStudents().stream().collect(Collectors.averagingInt(Student::getNoteBooks));
	}

	public static void main(String[] args) {
		System.out.println("Total notebookss "+sum());
		System.out.println("avg notebookss "+avg());
	}

}
