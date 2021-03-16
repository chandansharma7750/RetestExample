package module1retest;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		List<String> cites=new ArrayList<>();
		cites.add("mumbai");
		cites.add("delhi");
		cites.add("gaya");
		cites.add("patna");
		cites.add("pune");
		cites.add("kanpur");
		Stream<String> streamcites=cites.stream();
		Predicate<String>predicate=(city)->city.length()%2==0;
		Stream<String> evencites=streamcites.filter(predicate);
		Function<String,Integer>lengthfunction=(city)->city.length();
		Stream<Integer>lengthofcites=evencites.map(lengthfunction);
		Consumer<Integer>  consumer=(count)->System.out.println(count);
		lengthofcites.forEach(consumer);
	}
}
