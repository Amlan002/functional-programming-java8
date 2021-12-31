package Streams.terminal;

import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.Studentdatabase;

public class StreamMapping {

	public static void main(String[] args) {
		List<String> nameList= Studentdatabase.getAllStudents().stream().collect(Collectors.mapping(Student::getName, Collectors.toList()));
		nameList.forEach(System.out::println);
	}

}
