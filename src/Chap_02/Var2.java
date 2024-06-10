package Chap_02;

public class Var2 {
    public static void main(String[] args) {

        byte b = 5;
//        b = b + 1; /*-128 ~ 127 이 오류에서 중요한 것 크기가 아니라 타입임 숫자는 무조건 정수형 이기 때문에 */

        /*32bit + 8bit = 결과가 무조건 큰 bit 여야 함 32bit 정수를 8bit byte에 넣으려고 하다보니 안되는 것*/

        byte b2 = 6;
        b =(byte)(b + b2); /* 이건 왜 안될까? 연산을 하게 되면 중간 임시공간 = int 타입임 즉 b+ b2의 결과를 중간 임시공간에 넣어 뒀다가 b에 삽입하는 것이기 때문임
       결과 int 를 byte 타입으로 형 변환 시킨 것*/

        /*String 타입 변환하기*/

        String str = "30000";

        int value = Integer.parseInt(str);

        System.out.println(value);
        System.out.println(b);




    }
}
