package Optional;

import java.util.Optional;

public class OptionalOfEmptynullableExample {

	// if you not sure
	public static Optional<String> ofNullable() {
		// Optional<String> optional = Optional.ofNullable("Hello");
		Optional<String> optional = Optional.ofNullable(null);
		return optional;
	}

	// always accept valid string
	public static Optional<String> of() {
		Optional<String> optional = Optional.of("Hello");
		// Optional<String> optional = Optional.of(null);
		return optional;
	}

	// in exception block
	public static Optional<String> empty() {
		return Optional.empty();
	}

	public static void main(String[] args) {
		System.out.println("ofNullable " + ofNullable().isPresent());
		System.out.println("of " + of().isPresent());
		System.out.println("empty " + empty().isPresent());
	}

}
