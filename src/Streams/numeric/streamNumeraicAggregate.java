package Streams.numeric;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class streamNumeraicAggregate {
	public static void main(String[] args) {
			System.out.println("Sum "+IntStream.rangeClosed(1, 50).sum());	
			System.out.println("max "+IntStream.rangeClosed(1, 50).max());
			System.out.println("avg "+IntStream.rangeClosed(1, 50).average());
			
			System.out.println("min "+LongStream.rangeClosed(50, 100).min());
	}
}
