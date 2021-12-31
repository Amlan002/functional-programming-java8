package Streams.parallel;

import java.util.List;
import java.util.stream.Collectors;

import data.Studentdatabase;

public class ParallelStreamExample1 {

	public static List<String> printStudentActivities_seq() {

		long startTime = System.currentTimeMillis();
		List<String> studentActivities = Studentdatabase.getAllStudents().stream()
				.flatMap(student -> student.getActivities().stream()).collect(Collectors.toList());
		long endTime = System.currentTimeMillis();

		System.out.println("Duration in sequential " + (endTime - startTime));
		return studentActivities;
	}

	public static List<String> printStudentActivities_parallel() {
		long startTime = System.currentTimeMillis();
		List<String> studentActivities = Studentdatabase.getAllStudents().stream()
				.flatMap(student -> student.getActivities().stream().parallel()).collect(Collectors.toList());
		long endTime = System.currentTimeMillis();

		System.out.println("Duration in parallel " + (endTime - startTime));

		return studentActivities;
	}

	public static void main(String[] args) {
		System.out.println("call sequ "+printStudentActivities_seq());
		System.out.println("call parallel "+printStudentActivities_parallel());

	}

}
