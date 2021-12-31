package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import data.Student;
import data.Studentdatabase;

public class StreamMinExample {

	static List<Student> students = Studentdatabase.getAllStudents();

	public static int findMinValue(List<Integer> integersL) {
		return integersL.stream().reduce(0, (x, y) -> x < y ? x : y);
 	}
	
	public static Optional<Integer> findMinValueOptional(List<Integer> integersL) {
		return integersL.stream().reduce((x, y) -> x < y ? x : y);
 	}

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(7, 3, 5, 2, 9, 10, 38, 21);
		List<Integer> integers2=new ArrayList<Integer>();
		
		System.out.println("min never use default value ,cz "+findMinValue(integers));
		System.out.println(findMinValueOptional(integers).isPresent()==true?"min best way "+findMinValueOptional(integers).get():"No Value!Empty list");
		System.out.println(findMinValueOptional(integers2).isPresent()==true?"min best way "+findMinValueOptional(integers).get():"No Value!Empty list");
		
	}
}
