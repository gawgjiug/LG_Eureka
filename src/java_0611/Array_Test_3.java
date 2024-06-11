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

        String str[] = new String[10];

        for(int i = 0; i< str.length; i++){
            str[i]= String.valueOf(sc.nextInt());
        }




    }
}
