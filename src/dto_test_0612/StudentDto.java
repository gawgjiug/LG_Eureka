package dto_test_0612;

//학사 관리 프로그램에서 학생정보를 저장하는 용도의 클래스
public class StudentDto {
    String hakbun; //변수 (학번) 이렇게 변수를 정의하는 것을 필드라고 부름

    /* main 함수안에 있는 변수 -> 지역변수 -> 자동초기화가 안됨.
    *  하지만 field 는 자동으로 기본값으로 초기화 됨
    * 필드는 클래스로부터 객체가 생성된 후에 사용 가능함 */
    String name;
    String tel;

    void StudentDto (){ /*결과 없다 - > void return 하지않음*/

        System.out.println("StudentDto 생성 됨");
        System.out.println("학번 : " + hakbun);
        System.out.println("이름 : " + name );
        System.out.println("전화번호 : "+ tel);
    }
    public StudentDto  (String hakbun, String name ,String tel){
        this.hakbun = hakbun;
        this.name = name;
        this.tel = tel;

    }

    /*오버로딩 : 메소드 이름은 같되 매개변수의 타입, 개수, 순서가 다른 메소드를 여러 개 선언하는 것
    * this 키워드 : 객체 내부에서 인스턴스 멤버에 접근하기 위해 사용 -> */

}
