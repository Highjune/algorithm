package platform.programmers.코딩_기초_트레이닝;

public class 부분_문자열 {
    public static void main(String[] args) {
        부분_문자열 test = new 부분_문자열();
        System.out.println(test.solution("abc", "aabcc"));
        System.out.println(test.solution("tbt", "tbbttb"));
    }

    public int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }
}
