package java_0611;

public class Ref_Test {
    public static void main(String[] args) {

        int a = 100; //기본타입
        String name = "홍길동홍길동"; //참조 타입

        /*name 참조 타입 주소를 저장
        * name. <- 여기서 .은 가리키는 곳은? 의미함*/

        System.out.println(name.length());

        int b = 200;

        System.out.println(a == b);
        //기본 타입 끼리의 ==은 변수에 저장된 값 비교

        String name2 = new String("홍길동");
        String name3 = new String("홍길동");

        System.out.println(name2 == name3); //false


        name3= name2;

        System.out.println(name2 == name3); //true

        /* new로 생성하는 순간 다른 메모리 참조
        *
        * null 값은 참조타입 변수에만 적용 됨 */




    }
}
