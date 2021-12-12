package FunctionalInterface;

public class FunctionalGenericsDemo {

	public static void main(String[] args) {
		FunctionalGenerics<String, String> fun = s -> s.substring(1, 5);
		System.out.println("Substring " + fun.execute("Hibernate"));

		FunctionalGenerics<String, Integer> fun1 = s -> s.length();
		System.out.println("length " + fun1.execute("Hibernate"));

	}

}
