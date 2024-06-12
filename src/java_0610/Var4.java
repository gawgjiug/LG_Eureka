package java_0610;

import java.util.Scanner;

public class Var4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Scanner 는 java.utill 이라는 클래스에서 가져오는 것*/

        /*어디서 무엇을 읽어들일 것이냐? System.in (장치명) System 이라는 클래스 안에 in -> 키보드
        * out -> 화면 (정상 출력)
        * .err -> 화면 (오류 출력) */

        System.out.println("이름을 입력하세요 >>>");
        String s = sc.nextLine(); /*한 줄 전체를 읽어 반환*/
        System.out.println(s);


    }
}
