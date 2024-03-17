package platform.programmers.코딩_기초_트레이닝;

public class flag에_따라_다른_값_반환하기 {

    public static void main(String[] args) {
        flag에_따라_다른_값_반환하기 test = new flag에_따라_다른_값_반환하기();
        System.out.println(test.solution1(3, 4, true));
        System.out.println(test.solution2(3, 4, false));
    }

    public int solution1(int a, int b, boolean flag) {
        if (flag) {
            return a + b;
        }

        return a - b;
    }

    public int solution2(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }

}
