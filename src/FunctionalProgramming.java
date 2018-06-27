import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("one");
		strList.add("two");
		strList.add("three");
		strList.add("four");
		long count = strList.stream().filter((str) -> str.startsWith("t")).count();
		System.out.println(count);
		;

	}

}
