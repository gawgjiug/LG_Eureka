package java_0617;

public class Student_Test {
    public static void main(String[] args) {

        Student student = new Student("곽지욱","010-1234-4567","201947003","컴퓨터공학");

        student.printInfo();

        System.out.println("------------------------------------");

        Emp emp = new Emp("곽지욱","010-5555-6666","1100","개발 1팀");
        emp.printInfo();

        System.out.println("------------------------------------");

        emp.setBuseo("경영 1팀");
        emp.printInfo();

        Person person = student;
        /*부모타입 = 자식 타입*/
//        person = emp;

        /*부모타입 변수에 자식 타입 객체를 선언 할 수 있음
        * 왜 이런 것을 할까? -> 코드 단순화 (양 줄이기)
        * person 은 student의 주소값을 가짐 -> student 객체를 가리키게 됨 */

/*      person.getName();
        person.getTel();

        student.getName();
        student.getHakbun();
        student.getMajor();
        student.getTel();

        이러한 이유는? 학 h = new 학()
        h.fly();
        동물 d = h
        d. fly() ->  불 가능(모든 동물은 날 수 없음)
        부모 name, tel
        자식 : hakbun, major
        부모타입에서 자식으로 내려갈 수록 기능이 증가 됨 -> 특수화
        자식에서 부모로 올라갈 수록 기능이 축소 됨 -> 일반화

        용어로는 객체의 형 변환이라고 하지만 실제 객체의 타입은 변하지 않음
        객체를 가리키는 변수의 타입이 바뀌는 것

        규칙 1. 저장할 변수가 부모 타입인 경우 가능*/

        System.out.println("------------------------------------");


        person.printInfo();
        /*person은 student 변수가 가리키는 Student 객체를 가리키게 됨*/


        /*자식 객체가 부모 타입으로 자동 변환하면 부모 타입에 선언된 필드와 메소드만 사용가능*/

/*        Person person1 = new Student();

//        person1.getHakbun() error*/

          Student student1 = (Student)person;





    }
}
