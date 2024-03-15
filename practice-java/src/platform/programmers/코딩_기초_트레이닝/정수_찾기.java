package platform.programmers.코딩_기초_트레이닝;

import java.util.Arrays;
import java.util.stream.Stream;

public class 정수_찾기 {

	public static void main(String[] args) {
		int[] arr = new int[]{5, 10, 15, 20};
		정수_찾기 test = new 정수_찾기();
		System.out.println(test.solution1(arr, 5));
		System.out.println(test.solution2(arr, 5));
	}


	public int solution1(int[] num_list, int n) {
		int answer = 0;

		for (int i : num_list) {
			if (i == n) {
				answer = 1;
			}
		}

		return answer;
	}

	public int solution2(int[] num_list, int n) {
		return Arrays.stream(num_list)
			.anyMatch(num -> num == n) ? 1 : 0;
	}
}
