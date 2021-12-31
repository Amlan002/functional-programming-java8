package Optional;

import java.util.Optional;

import data.Student;
import data.Studentdatabase;

public class OptionalOrElseExample {

	// orElse
	public static String optionalOrElse() {
		// Optional<Student> optionalStudent =
		// Optional.ofNullable(Studentdatabase.studentSupplier.get());
		Optional<Student> optionalStudent = Optional.ofNullable(null);

		String name = optionalStudent.map(Student::getName).orElse("Default 1");
		return name;
	}

	// orElseGet
	public static String optionalOrElseGet() {
		// Optional<Student> optionalStudent =
		// Optional.ofNullable(Studentdatabase.studentSupplier.get());
		Optional<Student> optionalStudent = Optional.ofNullable(null);

		String name = optionalStudent.map(Student::getName).orElseGet(() -> "Default 2");
		return name;
	}

	// orElseThrow
	public static String optionalOrElseThrow() {
		// Optional<Student> optionalStudent =
		// Optional.ofNullable(Studentdatabase.studentSupplier.get());
		Optional<Student> optionalStudent = Optional.ofNullable(null);

		String name = optionalStudent.map(Student::getName).orElseThrow(() -> new RuntimeException("No data found"));
		return name;
	}

	public static void main(String[] args) {
		System.out.println(optionalOrElse());
		System.out.println(optionalOrElseGet());
		System.out.println(optionalOrElseThrow());
	}

}
