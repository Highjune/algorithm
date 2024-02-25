package platform.programmers.코딩_기초_트레이닝;
public class 문자열_곱하기 {
	public int solution(int num, int n) {
		int answer = 0;

		answer = num % n == 0 ? 1 : 0;
		return answer;
	}

}
