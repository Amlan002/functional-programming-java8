package Streams.terminal;

import java.util.stream.Collectors;

import data.Studentdatabase;

public class StreamCounting {

	public static long count() {
		return Studentdatabase.getAllStudents().stream()
				.filter(s->s.getGpa()>=3.9)
				.collect(Collectors.counting());
	}

	public static void main(String[] args) {
		System.out.println("Count " + count());
	}

}
