package Optional;

import java.util.Optional;

public class OptionalIfPresentIsPresent {

	public static void main(String[] args) {
		//isPresnt-check for null
		//Optional<String> optional=Optional.ofNullable(null);
		Optional<String> optional=Optional.ofNullable("hello");
		System.out.println("Is presnt "+optional.isPresent());
		if(optional.isPresent()) {
			System.out.println("value   "+optional.get());
		}

		
		//ifPresent- check for null & additional perform some thing
		optional.ifPresent(s->System.out.println(s));
		
	}

}
