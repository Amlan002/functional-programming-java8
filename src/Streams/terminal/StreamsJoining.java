package Streams.terminal;

import java.util.stream.Collectors;

import data.Student;
import data.Studentdatabase;

public class StreamsJoining {

	public static String join_1() {
		return Studentdatabase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining());
	}
	public static String join_2() {
		return Studentdatabase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining("-"));
	}
	public static String join_3() {
		return Studentdatabase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining("-", "(", ")"));
	}

	public static void main(String[] args) {
		System.out.println("first join " + join_1());
		System.out.println("second join " + join_2());
		System.out.println("third join " + join_3());
	}

}
