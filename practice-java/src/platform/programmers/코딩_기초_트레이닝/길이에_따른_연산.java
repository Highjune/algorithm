package platform.programmers.코딩_기초_트레이닝;

import java.util.stream.IntStream;

public class 길이에_따른_연산 {
    public static void main(String[] args) {

    }

    public int solution1(int[] num_list) {
        int result = 1;
        if (num_list.length >= 11) {
            for (int i : num_list) {
                result += i;
            }
            return result - 1;
        }

        for (int i : num_list) {
            result *= i;
        }
        return result;
    }

    public int solution2(int[] num_list) {
        return num_list.length >= 11 ? IntStream.of(num_list).sum()
                : IntStream.of(num_list).reduce(1, (a, b) -> a * b);
    }
}
