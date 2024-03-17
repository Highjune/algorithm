package platform.programmers.코딩_기초_트레이닝;

public class 첫_번째로_나오는_음수 {
    public static void main(String[] args) {

    }

    /**
     *  내 풀이
     */
    public int solution1(int[] num_list) {
        int result = -1;
        for (int i = 0 ; i < num_list.length ; i++) {
            if (num_list[i] < 0) {
                result = i;
                break;
            }
        }

        return result;
    }

    public int solution2(int[] num_list) {
        for (int i = 0 ; i < num_list.length ; i++) {
            if (num_list[i] < 0) {
                return i;
            }
        }
        return -1;
    }
}
