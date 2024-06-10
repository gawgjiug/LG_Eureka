package Chap_02;

public class Var1 {
    public static void main(String[] args) {

       /* int y ; // 변수 선언
        y = 2024; //값 할당

        int m = 6; //선언과 할당

//        byte b = 200; byte는 -128~ 128 오류 발생

        short b = 200;
//        char c = "A"; 오류 발생  String은 클래스임

        char c = 'A'; // 보이기엔 A로 보이지만 실제로는 숫자로 저장됨


        System.out.println(c);

        int  i = c;

        System.out.println(i); //65 type을 보고 숫자로 표기할지 문자로 표기할 지 결정함*/



        String s = "\"A\"";

        System.out.println(s);

        byte b = 5;
        int  i = b;

        //자바의 특성으로 시험에는 나올 수 있지만 실제 개발할 때는 거의 안씀

        System.out.println(i); //자동 타입 변환 특성임 데이터 타입을 다른 타입으로 변환하는 것
        // 값의 허용 범위가 작은 타입이 허용 범위가 큰 타입으로 대입 될 때 발생한다

        //정수 타입이 실수 타입으로 대입되면 무조건 자동 타입 변환이 됨

        //32 bit 데이터를 8bit 데이터로 넣을 때 나머지를 버리는, 강제로 타입을 변환하는 방법

        int intValue = 18;
        byte byteValue = (byte) intValue;

        System.out.println(byteValue);

        /*맨 오른쪽 비트 먼저 삽입 그 이유는? 가중치가 왼쪽으로 갈 수록 크기 때문에
        * 기계와 기계가 값을 주고 받을 때 맨 우측부터 먼저 주고 받는 방법이 있고, 맨 왼쪽 먼저 주고받는 방법이 있음
        * 이때 , 가중치가 큰 쪽을 MSB라고 부르고 가중치가 작은 쪽을 LSB (Most Significant bit) (Least)
        * 위 코드는 맨 우측에 8bit만 남기고 나머지는 버리는 것임 */

        int i2 = 150;

        byte b2= (byte) i2;

        System.out.println(b2);

        /*값의 허용범위를 넘어버려서 값이 변형됨*/

        /*## int 타입의 자동 형변환*/







    }
}
