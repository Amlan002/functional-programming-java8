package staticAndDefaultMethod;

public interface Interface3 extends Interface2{
	default void methodC() {
		System.out.println("Inside 3");
	}
	default void methodB() {
		System.out.println("Inside 2 ##"+Interface3.class);
	}
}
