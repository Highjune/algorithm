package platform.programmers.코딩_기초_트레이닝;

import java.util.Arrays;

public class n_번째_원소부터 {
    public static void main(String[] args) {
        int[] k = {5, 2, 1, 7, 5};
        n_번째_원소부터 test = new n_번째_원소부터();
        int[] solution = test.solution(k, 2);
        for (int i : solution) {
            System.out.println(i);
        }
    }

    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, n - 1, num_list.length);
    }
}
