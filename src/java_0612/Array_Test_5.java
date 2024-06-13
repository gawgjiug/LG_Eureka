package java_0612;

import java.util.Scanner;

public class Array_Test_5 {
    public static void main(String[] args) {

        //구구단 출력

        for(int i = 2; i<=9; i++){
            System.out.println("** "+i+"단"+" **");
            for(int j = 1; j<=9; j++){
                System.out.println(i +"*"+j+"="+(i*j));
            }

        }

        /*챕터 6.4
        객체를 생성한다는 것은 힙 영역에 공간을 배정하는 것

        클래스 안에는 변수와 메서드 생성자가 존재


        클래스의 용도 4가지
        1. 데이터 정의용 : XXX Dto , ~~~Vo 등등
        2. 데이터 관리용
        3. UI 정의용
        4. 입출력 (통신)용
        클래스의 용도에 따라서 구조가 달라짐

        객체지향의 3대 특징
        1. 은닉성 : 중요한 내부 변수, 함수를 감추는 것
        2. 상속성 : 다른 클래스에서 정의한 것을 그대로 가져와 정의하는 것
        3. 다형성 : 한 가지 변수에 다른 타입의 객체를 저장할 수 있는 것
        */

    }
}
