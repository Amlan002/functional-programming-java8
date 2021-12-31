package Streams.factory;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfIterateGenerate {

	public static void main(String[] args) {
		Stream<String> stream= Stream.of("adam","dan","julie");
		stream.forEach(System.out::println);
		
		Stream.iterate(1, x->x*2).limit(10).forEach(System.out::println);
		
		System.out.println("random");
		Supplier<Integer> supplier=new Random()::nextInt;
		Stream.generate(supplier).limit(10).forEach(System.out::println);
	}

}
