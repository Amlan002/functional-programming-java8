package Streams.numeric;

import java.util.stream.IntStream;

public class StreamNumericRangeCount {

	public static void main(String[] args) {
		IntStream intStream = IntStream.range(1, 50);
		System.out.println("Count of range "+intStream.count());
		
		IntStream.range(1, 50).forEach(v->System.out.println(v+","));
		System.out.println("=========");
		IntStream.rangeClosed(1, 50).forEach(v->System.out.println(v+","));
	}

}
