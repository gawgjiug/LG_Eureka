package Chap_02;

import java.util.Scanner;

public class Operator_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();

        /*베타적 논리합 = 다를 때만 참 , 같으면 거짓
        * true true  =  false
        * 피연산자가 하나는 true이고 다른 하나가 false 일 경우에만 연산 결과가 true */

        /**/

        System.out.println(5/0.0);
        System.out.println(5 % 0.0);

        int i = 5;

        i += 7; // i = 1+7

        /*삼항 연산자
        * 조건식 ? 값 or 연산식 : 값 or 연산식
        * 비교연산이 true 이면 첫번째 반환 아니면 두번째 반환*/



        int age = 2024 - sc.nextInt();

        String msg = (age <= 19) ? "미성년자 입니다." : "성인입니다.";

        System.out.println(msg);


    }
}
