package java_0611;

import java.util.Scanner;

public class Array_Test_3 {
    public static void main(String[] args) {

        //문자열 배열 3개를 만들고 "홍길동", "김길동", '박길동" 을 저장?

/*        String str [] = new String[3];
        str [0] = "홍길동";
        str [1] = "김길동";
        str [2] = "박길동";

        System.out.println(str[0]);
        System.out.println(str[1]);
        System.out.println(str[2]);*/

        Scanner sc = new Scanner(System.in);

/*        String str[] = new String[10];

        for(int i = 0; i< str.length; i++){
            str[i]= String.valueOf(sc.nextInt());
        }*/

        /* == 연산자 int 타입은 값을 비교함
        new String일 경우 주소 비교
        new -> 메모리를 따로 배정 받음 -> 주소가 다르다* /
         */

        int arr [] = new int[10];
        int sum = 0;


        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double avg = sum /arr.length;

        System.out.println(avg);






    }
}
