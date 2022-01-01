package staticAndDefaultMethod;

public interface Interface2 extends Interface1{
	default void methodB() {
		System.out.println("Inside 2");
	}
	default void methodA() {
		System.out.println("Inside 1 **"+Interface2.class);
	}
}
