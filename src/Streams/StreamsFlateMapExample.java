package Streams;

import java.util.List;
import java.util.stream.Collectors;

import data.Studentdatabase;

public class StreamsFlateMapExample {

	public static List<String> printStudentActivities() {
		List<String> studentActivities = Studentdatabase.getAllStudents().stream() 
				.flatMap(student -> student.getActivities().stream()) 
				.collect(Collectors.toList());
		return studentActivities;
	}
	
	public static List<String> printUniqueStudentActivities() {
		List<String> studentActivities = Studentdatabase.getAllStudents().stream() 
				.flatMap(student -> student.getActivities().stream())
				.distinct()
				.collect(Collectors.toList());
		return studentActivities;
	}
	
	public static long printUniqueStudentActivitiesCount() {
		return Studentdatabase.getAllStudents().stream() 
				.flatMap(student -> student.getActivities().stream())
				.distinct()
				.count();
		
	}
	
	public static List<String> sortUniqueStudentActivities() {
		List<String> studentActivities = Studentdatabase.getAllStudents().stream() 
				.flatMap(student -> student.getActivities().stream())
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		return studentActivities;
	}

	public static void main(String[] args) {

		System.out.println("print Student Activities using flate map : " + printStudentActivities());
		System.out.println("print unique Student Activities using flate map : " + printUniqueStudentActivities());
		System.out.println("count unique Student Activities using flate map : " + printUniqueStudentActivitiesCount());
		System.out.println("sorted unique StudentActivities using flate map : " + sortUniqueStudentActivities());

	
	}
}
