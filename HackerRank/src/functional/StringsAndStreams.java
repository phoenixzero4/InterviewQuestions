package functional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StringsAndStreams {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Surgeit", "Technology", "Interview", "Internet", "William");
		Optional<String> longest = list.stream()
        .max(Comparator.comparingInt(String::length));
		System.out.println(longest);

	}

}
