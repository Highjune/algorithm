package platform.programmers.코딩_기초_트레이닝;

import java.util.Scanner;

public class 홀짝_구분하기 {
    /**
     * 내 풀이
     */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        String evenString = " is even";
//        String oddString = " is odd";
//
//        if (n % 2 == 0) {
//            System.out.println(n + evenString);
//        } else {
//            System.out.println(n + oddString);
//        }
//    }

    /**
     * 남 풀이
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(n + ((n % 2 == 0) ? " is even" : " is odd"));
    }

}
