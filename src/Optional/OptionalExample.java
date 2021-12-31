package Optional;

import java.util.Optional;

import data.Student;
import data.Studentdatabase;

public class OptionalExample {

	//without optional
	public static String getStudentname() {
		//Student student = Studentdatabase.studentSupplier.get();
		Student student =null;
		if (student != null) {
			return student.getName();
		}
		return null;
	}
	
	//with optional
	public static Optional<String> getname() {
		//Optional<Student> optional=Optional.ofNullable(Studentdatabase.studentSupplier.get());
		Optional<Student> optional=Optional.ofNullable(null);
		if(optional.isPresent()) {
			return optional.map(Student::getName);
		}
		return Optional.empty();//no value
	}

	public static void main(String[] args) {
		//without optional
		String name = getStudentname();
		if(name!=null) {
			System.out.println("Length of the student name without optional " + name.length());
		}else {
			System.out.println("name not found without optional");
		}
		
		//with optional
		Optional<String> sOptional=getname();
		if(sOptional.isPresent()) {
			System.out.println("Length of the student name with optional "+sOptional.get().length());
		}else {
			System.out.println("name not found with optional");
		}
	}

}
