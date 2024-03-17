package platform.programmers.코딩_기초_트레이닝;

public class 정수부분 {
    public static void main(String[] args) {
        double flo = 3.14;
        정수부분 test = new 정수부분();
        System.out.println(test.solution1(flo));
        System.out.println(test.solution2(flo));
    }

    public int solution1(double flo) {
        return (int)Math.floor(flo);
    }

    public int solution2(double flo) {
        return (int)flo;
    }

}
