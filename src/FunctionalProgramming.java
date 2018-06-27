import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming {

	public static void main(String[] args) {
		List<Integer> strList = new ArrayList<>();
		strList.add(1);
		strList.add(2);
		strList.add(3);
		strList.add(4);
		strList.stream().filter((num) -> num > 1).map(num -> num * 2).collect(Collectors.toList()).forEach(num -> {
			System.out.println(num);
		});
	
	}

}
