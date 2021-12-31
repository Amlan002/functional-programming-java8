package Streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import data.Student;
import data.Studentdatabase;

public class StreamExample {

	static List<Student> students = Studentdatabase.getAllStudents();

	public static void main(String[] args) {
		
		Predicate<Student> gpaP=s->s.getGpa()>=3.9; 

		System.out.println("Student name as key and activities as value");
		Map<String, List<String>> map1 = students.stream()
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println(map1);
		
		System.out.println("Student name as key and activities as value whos grade level greater than or equal to 3");
		Map<String, List<String>> map2 = students.stream()
				.filter(s->s.getGradeLevel()>=3)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println(map2);
		
		System.out.println("Student name as key and activities as value whos grade level greater than or equal to 3 and gpa above 3.9");
		Map<String, List<String>> map3 = students.stream()
				.filter(s->s.getGradeLevel()>=3)
				.filter(gpaP)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println(map3);
		
		System.out.println("Student name as key and activities as value whos grade level greater than or equal to 3 and gpa above 3.9 using parallel stream");
		Map<String, List<String>> map4 = students.parallelStream()
				.filter(s->s.getGradeLevel()>=3)
				.filter(gpaP)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println(map4);
		
	}

}
