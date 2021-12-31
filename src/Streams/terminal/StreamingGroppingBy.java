package Streams.terminal;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import data.Student;
import data.Studentdatabase;

public class StreamingGroppingBy {

	public static Map<String, List<Student>> groupStudentByGenger() {
		return Studentdatabase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGender));
	}

	public static Map<String, List<Student>> customizedStudentByGenger() {
		return Studentdatabase.getAllStudents().stream()
				.collect(Collectors.groupingBy(s -> s.getGpa() >= 3.8 ? "Outstsanding" : "Average"));
	}

	public static void twoLevelGrouping_1() {

		Map<Integer, Map<String, List<Student>>> studentMap = Studentdatabase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,
						Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));

		System.out.println(studentMap);
	}

	public static void twoLevelGrouping_2() {

		Map<String, Integer> studentMap = Studentdatabase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getName, Collectors.summingInt(Student::getNoteBooks)));

		System.out.println(studentMap);
	}

	public static void threeArgumentGroupBy() {

		LinkedHashMap<String, Set<Student>> studentLinkedHashmap = Studentdatabase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));

		System.out.println(studentLinkedHashmap);
	}

	public static void calculateTopGpa() {

		Map<Integer, Optional<Student>> studentMapOptional = Studentdatabase.getAllStudents().stream().collect(
				Collectors.groupingBy(Student::getGradeLevel, Collectors.maxBy(Comparator.comparing(Student::getGpa))));

		// System.out.println(studentMapOptional);

		Map<Integer, Student> studentMapOptional1 = Studentdatabase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, Collectors
						.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));

		System.out.println(studentMapOptional1);
	}

	public static void calculateleastGpa() {

		Map<Integer, Optional<Student>> studentMapOptional = Studentdatabase.getAllStudents().stream().collect(
				Collectors.groupingBy(Student::getGradeLevel, Collectors.minBy(Comparator.comparing(Student::getGpa))));

		// System.out.println(studentMapOptional);

		Map<Integer, Student> studentMapOptional1 = Studentdatabase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, Collectors
						.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)), Optional::get)));

		System.out.println(studentMapOptional1);
	}

	public static void main(String[] args) {
		System.out.println("Group by gender " + groupStudentByGenger());
		System.out.println("Custom Group by gpa " + customizedStudentByGenger());
		System.out.println("two lvl Custom Group 1");
		twoLevelGrouping_1();
		System.out.println("two lvl Custom Group 2");
		twoLevelGrouping_2();
		System.out.println("three lvl Custom Group 1");
		threeArgumentGroupBy();
		System.out.println("top gpa in every grade");
		calculateTopGpa();
		System.out.println("least gpa in every grade");
		calculateleastGpa();
		
	}
}
