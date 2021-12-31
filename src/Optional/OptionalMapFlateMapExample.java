package Optional;

import java.util.Optional;

import data.Bike;
import data.Student;
import data.Studentdatabase;

public class OptionalMapFlateMapExample {

	// filter
	public static void optionFilter() {
		Optional<Student> optionalStudent = Optional.ofNullable(Studentdatabase.studentSupplier.get());
		optionalStudent.filter(s -> s.getGpa() >= 3.5).ifPresent(s -> System.out.println(s));
	}

	// map
	public static void optionalMap() {
		Optional<Student> optionalStudent = Optional.ofNullable(Studentdatabase.studentSupplier.get());
		if (optionalStudent.isPresent()) {
			Optional<String> optionalName = optionalStudent.filter(s -> s.getGpa() >= 3.5).map(Student::getName);
			System.out.println(optionalName.get());
		}
	}

	// flatemap
	public static void optionlFlateMap() {
		Optional<Student> optionalStudent = Optional.ofNullable(Studentdatabase.studentSupplier.get());
		Optional<String> optionalName =optionalStudent.filter(s->s.getGpa()>3.5)
					   .flatMap(Student::getBike).map(Bike::getModel);
	
	optionalName.ifPresent(s->System.out.println("name is "+s));
	}

	public static void main(String[] args) {
		optionFilter();
		optionalMap();
		optionlFlateMap();
	}

}
