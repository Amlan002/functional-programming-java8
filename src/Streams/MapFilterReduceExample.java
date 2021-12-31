package Streams;

import java.util.List;

import data.Student;
import data.Studentdatabase;

public class MapFilterReduceExample {
	static List<Student> students = Studentdatabase.getAllStudents();
	
	private static int noOfNoteBooks() {
		return students.stream()
				.filter(s->s.getGradeLevel()>=3)
				.map(Student::getNoteBooks)
			//.reduce(0,(a,b)->a+b);
			  .reduce(0, Integer::sum);
	}

	public static void main(String[] args) {
		System.out.println("No of notebooks "+noOfNoteBooks());

	}

}
