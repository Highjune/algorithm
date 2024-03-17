package platform.programmers.코딩_기초_트레이닝;

public class 소문자로_바꾸기 {

    public static void main(String[] args) {
        String myString = "mySTRING";
        소문자로_바꾸기 test = new 소문자로_바꾸기();
        System.out.println(test.solution(myString));
    }

    public String solution(String myString) {
        return myString.toLowerCase();
    }

}
