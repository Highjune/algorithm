package platform.programmers.코딩_기초_트레이닝;

public class 문자열_곱하기 {
	public static void main(String[] args) {
		문자열_곱하기 test = new 문자열_곱하기();
		System.out.println(test.solution("june", 10));
	}

	public String solution(String my_string, int k) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i <= k; i++) {
			stringBuilder.append(my_string);
		}
		return stringBuilder.toString();
	}

}
