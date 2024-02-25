package platform.programmers.코딩_기초_트레이닝;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 문자열_곱하기 {
	public static void main(String[] args) {
		문자열_곱하기 test = new 문자열_곱하기();
		// System.out.println(test.solution1("june", 10));
		// System.out.println(test.solution2("june", 10));
		System.out.println(test.solution3("june", 10));
	}

	/**
	 *  내 풀이
	 */
	public String solution1(String my_string, int k) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i <= k; i++) {
			stringBuilder.append(my_string);
		}
		return stringBuilder.toString();
	}

	/**
	 * best practice
	 */
	public String solution2(String my_string, int k) {
		return my_string.repeat(k);
	}

	/**
	 * stream으로 풀어보기
	 */
	public String solution3(String my_string, int k) {
		return IntStream.range(0, k).mapToObj(x -> my_string).collect(Collectors.joining());
	}

}
