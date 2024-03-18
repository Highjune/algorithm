package platform.programmers.코딩_기초_트레이닝;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class n개_간격의_원소들 {
    public static void main(String[] args) {
        n개_간격의_원소들 test = new n개_간격의_원소들();
        int[] num_arr1 = {4, 2, 6, 1, 7, 8};
        int[] solution = test.solution(num_arr1, 4);
        System.out.println(Arrays.toString(solution));
    }

    public int[] solution(int[] num_list, int n) {
        int[] result = new int[(num_list.length / n) + 1];

        int k = 0;
        for (int i = 0; i < num_list.length; i += n) {
            result[k] = num_list[i];
            k++;
        }

        return result;
    }
}