package platform.programmers.코딩_기초_트레이닝;

import java.util.Arrays;

public class 문자열의_앞의_n글자 {

	public static void main(String[] args) {
		String answer = "ProgrammerS";
		String my_string = "ProgrammerS123";
		int n = 11;
		문자열의_앞의_n글자 problem = new 문자열의_앞의_n글자();
		System.out.println(answer.equals(problem.solution1(my_string, n)));
		System.out.println(answer.equals(problem.solution2(my_string, n)));
	}

	/**
	 * 함수 사용
	 */
	public String solution1(String my_string, int n) {
		return my_string.substring(0, n); // endIndex is exclusive
	}

	/**
	 * 그냥 노가다
	 */
	public String solution2(String my_string, int n) {
		StringBuilder sb = new StringBuilder();
		char[] charArr = my_string.toCharArray();
		for (int i = 0; i < n; i++) {
			sb.append(charArr[i]);
		}

		return sb.toString();
	}


}
