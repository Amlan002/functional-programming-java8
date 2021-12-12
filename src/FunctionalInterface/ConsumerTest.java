package FunctionalInterface;

import java.util.List;
import java.util.function.Consumer;

/*Consumer<T> is an in-built functional interface introduced in Java 8 in the java. util. function package. 
Consumer can be used in all contexts where an object needs to be consumed,i.e. taken as input, and some 
operation is to be performed on the object without returning any result.*/

public class ConsumerTest {

	public static void main(String[] args) {

		List<Integer> list = List.of(34, 78, 8, 37, 90, 46, 98);
		Consumer<Integer> consumer = e -> System.out.println(e);
		consumer.accept(47);

		System.out.println("Print list");
		printList(list, consumer);

	}

	private static <T> void printList(List<T> list, Consumer<T> consumer) {

		for (T t : list) {
			consumer.accept(t);
		}

		// same work
		//list.stream().forEach(x -> consumer.accept(x));

	}

}
