package platform.programmers.코딩_기초_트레이닝;

public class 공배수 {
	public static void main(String[] args) {
		공배수 question = new 공배수();
		System.out.println(question.solution1(60, 2, 3));
		System.out.println(question.solution2(60, 2, 3));
	}

	/**
	 * 내 풀이
	 */
	public int solution1(int number, int n, int m) {
		if (number % n == 0 && number % m == 0) {
			return 1;
		}
		return 0;
	}

	/**
	 * (다른 풀이) 3항 연산자
	 */
	public int solution2(int number, int n, int m) {
		return (number % n == 0) && (number % m == 0) ? 1 : 0;
	}
}
