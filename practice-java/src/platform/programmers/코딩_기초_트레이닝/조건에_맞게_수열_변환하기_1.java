package platform.programmers.코딩_기초_트레이닝;

public class 조건에_맞게_수열_변환하기_1 {
    public static void main(String[] args) {

    }

    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        for (int k = 0 ; k < arr.length ; k++) {
            int element = arr[k];
            if (element >= 50 && element % 2 == 0) {
                answer[k] = element / 2;
            } else if (element < 50 && element % 2 != 0) {
                answer[k] = element * 2;
            } else {
                answer[k] = element;
            }
        }

        return answer;
    }
}
