package platform.programmers.코딩_기초_트레이닝;

public class 문자열로_변환 {
    public static void main(String[] args) {
        문자열로_변환 test = new 문자열로_변환();
        System.out.println(test.solution1(3));
        System.out.println(test.solution2(4));
    }

    /**
     *  내 풀이
     */
    public String solution1(int n) {
        return String.valueOf(n);
    }

    public String solution2(int n) {
        return n + "";
    }
}
