package platform.programmers.코딩_기초_트레이닝;

import java.util.Arrays;

public class n보다_커질때까지_더하기 {

	public static void main(String[] args) {
		n보다_커질때까지_더하기 test = new n보다_커질때까지_더하기();
		int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7};
		// System.out.println(test.solution1(numbers, 11));
		// System.out.println(test.solution2(numbers, 11));
		System.out.println(test.solution3(numbers, 11));
	}

	/**
	 * 첫 번째 풀이
	 */
	public int solution1(int[] numbers, int n) {
		int answer = 0;

		for (int i = 0; i < numbers.length; i++) {
			answer += numbers[i];
			if (answer > n) {
				break;
			}
		}
		return answer;
	}

	/**
	 * best practice1
	 */
	public int solution2(int[] numbers, int n) {
		return Arrays.stream(numbers).reduce(0, (acc, i) -> n >= acc ? acc + i : acc);
	}

	/**
	 * best practice2
	 */
	public int solution3(int[] numbers, int n) {
		int answer = 0;

		for (int i = 0; answer < n; i++) {	// good
			answer += numbers[i];
		}

		return answer;
	}
}
