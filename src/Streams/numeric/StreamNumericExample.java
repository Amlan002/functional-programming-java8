package Streams.numeric;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamNumericExample {

	public static int sum(List<Integer> list) {
		return list.stream().reduce(0,(x,y)->x+y);
	}
	
	public static int sumStream() {
		return IntStream.rangeClosed(1, 9).sum();
	}
	
	public static void main(String[] args) {
		List<Integer> integers=Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println("Sum using unboxing Integer to int "+sum(integers));
		System.out.println("Sum using int sumStream "+sumStream());

	}

}
