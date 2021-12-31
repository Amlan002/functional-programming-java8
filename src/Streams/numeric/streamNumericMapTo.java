package Streams.numeric;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class streamNumericMapTo {

	public static List<Integer> mapToObj() {
		return IntStream.rangeClosed(1, 5).mapToObj((i) -> {
			return new Integer(i);
		}).collect(Collectors.toList());
	}

	public static long mapToLong() {
		return IntStream.range(1, 5).mapToLong(i -> i).sum();
	}
	
	public static double mapToDou() {
		return IntStream.range(1, 5).mapToDouble(i -> i).sum();
	}

	public static void main(String[] args) {
		System.out.println("map to Object " + mapToObj());
	
		System.out.println("map to long " + mapToLong());

		System.out.println("map to double " + mapToDou());

	}

}
