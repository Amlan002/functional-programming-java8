package Streams;

import java.util.List;
import java.util.Optional;

import data.Student;
import data.Studentdatabase;

public class StreamFindExample {
	static List<Student> students = Studentdatabase.getAllStudents();

	public static Optional<Student> findAnyStudent(){
		return students.stream().filter(s->s.getGpa()>=3.9).findAny();
	}
	
	public static Optional<Student> findFirstStudent(){
		return students.stream().filter(s->s.getGpa()>=3.9).findFirst();
	}
	
	public static void main(String[] args) {
		System.out.println("Result of find any " + findAnyStudent().get());
		System.out.println("Result of find first " + findFirstStudent().get());

	}

}
