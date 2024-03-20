package Java8Ex;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionEx {

	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5);
		ls.forEach((n) -> {
			System.out.println(n);
		});
	}
}
