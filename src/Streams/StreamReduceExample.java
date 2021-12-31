package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import data.Student;
import data.Studentdatabase;

public class StreamReduceExample {

	static List<Student> students = Studentdatabase.getAllStudents();

	public static int perfomrMultiplication(List<Integer> integerList) {
		return integerList.stream()
				.reduce(1, (a,b)->a*b);
	}
	
	public static Optional<Student> getHighestGpa(){
		return students.stream().reduce((s1,s2)->(s1.getGpa()>s2.getGpa()?s1:s2));
	}
	
	public static void main(String[] args) {
		
		List<Integer> integers=Arrays.asList(1,3,5,7);
		System.out.println("Multiplication======="+perfomrMultiplication(integers));
		System.out.println("Highest GPA==");
		if(getHighestGpa().isPresent()) {
			System.out.println(getHighestGpa().get());
		}
	}

}
