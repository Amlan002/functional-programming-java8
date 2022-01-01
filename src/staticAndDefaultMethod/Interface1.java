package staticAndDefaultMethod;

public interface Interface1 {
	default void methodA() {
		System.out.println("Inside 1--"+Interface1.class);
	}
}
