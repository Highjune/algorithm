package platform.programmers.코딩_기초_트레이닝;

public class 두_수의_연산값_비교하기 {
    public static void main(String[] args) {
        두_수의_연산값_비교하기 test = new 두_수의_연산값_비교하기();
        System.out.println(test.solution(2, 91));
        System.out.println(test.solution(91, 2));
    }

    public int solution(int a, int b) {
        return Math.max(Integer.parseInt(String.valueOf(a) + String.valueOf(b)), 2 * a * b);
    }
}
