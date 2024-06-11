package java_0611;

public class String_Test {
    public static void main(String[] args) {

        /*로컬 변수는 무조건 stack에 할당 됨,
        * 멤버 변수는 무조건 heap
        * heap = 객체가 존재하는 공간
        * ````
        * 문자열 리터럴(값)이 동일하다면 String 객체를 공유
        * */

        String n1 ="홍";
        String n2 ="홍";

        System.out.println(n1 == n2 ); //true

        String n3 = new String("길");
        String n4 = new String("길");

        System.out.println(n3 == n4); //false
        /*new 없이 String 생성시 같은 문자열이면 자동 공유함.
        * 자바 입문시 가장 중요한 개념 항상 시험 문제 출제.
        * new 하면 주소다름 사용할 공간 새롭게 배정*/

    }
}
