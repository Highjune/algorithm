package platform.programmers.코딩_기초_트레이닝;

import java.util.Arrays;

public class n_번째_원소까지 {
    public static void main(String[] args) {
        n_번째_원소까지 test = new n_번째_원소까지();
        int[] problem = {2, 1, 6};
        int[] result = test.solution2(problem, 2);
        for (int i : result) {
            System.out.println(i);
        }
    }

    /**
     * 내 풀이
     */
    public int[] solution1(int[] num_list, int n) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }

    /**
     * 타인 풀이
     */
    public int[] solution2(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, 0, n);
    }
}
