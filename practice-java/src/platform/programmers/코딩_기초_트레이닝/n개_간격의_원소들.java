package platform.programmers.코딩_기초_트레이닝;

import java.util.ArrayList;
import java.util.List;

public class n개_간격의_원소들 {
    public static void main(String[] args) {

    }

    public int[] solution(int[] num_list, int n) {
        int[] result = {};
        List<Integer> resultList = new ArrayList<>();

        int size = 0;
        for (int i = n - 1; i < num_list.length; i += n) {
            size++;
            resultList.add(num_list[i]);
        }
        resultList.toArray(new Integer[size]);
    }
}