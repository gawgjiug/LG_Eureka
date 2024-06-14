package java_0614;

public class Modifer_Test {
    public static void main(String[] args) {

        /*접근 제한자 테스트용*/

        Person_Dto personDto = new Person_Dto("홍길동","010-3287-3858"); /*간접 접근*/
        Person_Dto personDto2 = new Person_Dto();

        /*사용 코드에 따라서 사용되는 생성자 메소드가 다름*/

        personDto.printInfo();

        System.out.println("----------------");

        personDto2.printInfo(); //null

//        personDto.name = "박";

        /*field name is not visible -> 직접 접근 불가
        * 메소드를 통해 간접 접근 해야함.
        * */

        System.out.println("-----------");

        System.out.println(personDto.getName());
        personDto.setName("곽지욱");
        personDto.printInfo();

        System.out.println("-----------");
        personDto.setTel("010-5555-4444");

        personDto.printInfo();

        /*데이터용 클래스 작성 요령
        * 1. 이름에 Dto 붙이기
        * 2. 변수에 private 적용
        * 3. private 변수용 getter, setter 메서드 작성
        * ex_public String get
        * public void set
        * 4. 내부 변수값 출력용 메서드 작성*/

        System.out.println("-----------------");

       Student_Dto studentDto = new Student_Dto("김철수","010-1234","100",
               "컴공");

       studentDto.getName();
       studentDto.printInfo();

       /*Student_Dto 클래스가 Person_Dto 클래스를 상속받았기 때문에
       * Student_Dto 클래스에 선언되지 않은 메소드를 사용가능함.
       * 자식 생성자를 생성하면 자동으로 부모 생성자가 먼저 생성됨
       * 상속 개념은 평가에 반드시 나옴
       * super는 부모클래스를 지칭*/






    }
}
