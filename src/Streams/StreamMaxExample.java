package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import data.Student;
import data.Studentdatabase;

public class StreamMaxExample {
	static List<Student> students = Studentdatabase.getAllStudents();

	public static int findMaxValue(List<Integer> integersL) {
		return integersL.stream().reduce(0, (x, y) -> x > y ? x : y);
 	}
	
	public static Optional<Integer> findMaxValueOptional(List<Integer> integersL) {
		return integersL.stream().reduce((x, y) -> x > y ? x : y);
 	}

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 3, 5, 7, 9, 10, 38, 21);
		List<Integer> integers2=new ArrayList<Integer>();
		
		System.out.println("max "+findMaxValue(integers));
		System.out.println(findMaxValueOptional(integers).isPresent()==true?"max best way "+findMaxValueOptional(integers).get():"No Value!Empty list");
		System.out.println(findMaxValueOptional(integers2).isPresent()==true?"max best way "+findMaxValueOptional(integers).get():"No Value!Empty list");
		
	}

}
