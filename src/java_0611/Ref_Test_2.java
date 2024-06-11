package java_0611;

public class Ref_Test_2 {
    public static void main(String[] args) {

        /*메서드 내부 변수선언과 클래스 내부 변수선언이 있음.
        * 내부 -> 로컬변수
        * 클래스 -> 멤버 변수
        * 멤버 변수는 객체 안에 생성되어있음
        * 로컬 변수는 선언시 반드시 초기화 해야함 안하면 읽을 수 없음*/

//        int a; //로컬변수 선언, 초기값 미제공 -> 초기화 안된 상태임
//        System.out.println(a);  error

        int a = 0; //초기화
        System.out.println(a);

        //
/*      String n ; //참조 타입 선언 , 초기화 안된 상태
        System.out.println(n); 위와 똑같은 이유로 error */

        String n = ""; //Heap 공간에 메모리가 할당됨 n은 그 Heap 공간에 번지수(주소)를 가지고 있음
        System.out.println(n);

        /*null은 비어있다는 것
        * null은 모든 참조타입에 초기값으로 공통적으로 사용할 수 있음
        * NullPointerException 오류는 변수가 null인 상태에서 객체의 데이터나 메소드를 사용하려 할 때 발생하는 예외임
        * 예를 들어 물건을 구매할 때 잔액부족 오류 -> 자주 발생하지 않음 (구매)라는 조건이 필수적
        * 걷다가 헛디딤 -> 자주 일어남(걷는다)라는 조건은 아주 자주 일어남
        * NullPointerException은 사용하려고 할 때 발생*/
        String n2 = null;
        System.out.println(n2);


    }
}
