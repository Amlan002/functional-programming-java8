package Streams.terminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import data.Student;
import data.Studentdatabase;

public class StreamPartitioning {

 		public static void partitioningBy_1(){

	        Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.8;
	        Map<Boolean,List<Student>> partitioningMap = Studentdatabase.getAllStudents()
	                .stream()
	                .collect(Collectors.partitioningBy(gpaPredicate));

	        System.out.println("partitioningMap : " + partitioningMap);
	    }

	    public static void partitioningBy_2(){

	        Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.8;

	        Map<Boolean,Set<Student>> partitioningMap = Studentdatabase.getAllStudents()
	                .stream()
	                .collect(Collectors.partitioningBy(gpaPredicate,
	                		Collectors.toSet()));

	        System.out.println("partitioningMap_2 : " + partitioningMap);
	    }

	    public static void main(String[] args) {
	    	System.out.println("==================match by gpa one argu");
	        partitioningBy_1();
	    	System.out.println("==================match by gpa two argu");
	        partitioningBy_2();

	    }
	}
