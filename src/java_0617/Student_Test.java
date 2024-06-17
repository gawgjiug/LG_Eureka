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

          /*자식타입에서 부모 타입으로 -> up Casting
          * 동물 d = new 사자 -> okay (Up Casting)
          * Student s = new Student(~~~)
          * Person p = s
          * 반대는??
          * Student s1 = p; -> Down Casting 은 무조건 강제 형변환을 해줘야 함
          * Student s1 = (Student) p; 앞에 캐스팅 연산자가 필요함
          * 객체 형 변환은 아래같은 코드를 목표로 한다*/

        System.out.println("-------------------------------------------");

        Person [] parr = new Person[3];

        parr [0] = new Student("곽지욱","010-5555-7777","201947003","컴공");
        parr [1] = new Emp("홍길동","010-1235-7564","0100-E","프론트엔드 1팀");
        parr [2] = new Emp("김철수","010-7456-4512","0200-A","백엔드 2팀");

        /*다양한 자식 객체들을 부모타입 1가지로 일괄 관리 가능*/

        for(int i = 0 ; i<parr.length; i++){
            parr[i].printInfo();
            System.out.println("-------**-------");
        }

        /*다형성이란
        * 동일 변수에 여러가지 타입을 저장가능한 기능을 말함
        * Person 타입에 Student 타입도 가능하고...
        * 왜 도입 되었을까?
        * 코드량 줄어듬... */

/*        Student s1 = (Student) parr[0];
        Emp e1 = (Emp) parr[1];         */

        /*Down-Casting이 필요한 이유
        * Up-Casting의 장점 : 부모타입 하나로 많은 자식 타입들을 일괄저장 가능
        * 단점: 부모타입의 변수,메서드만 사용 가능. 자식타입 고유의 변수 접근 불가
        *
        * Down-Dasting이 필요한 이유 : 자식 타입 고유의 변수를 접근하기 위해*/

/*        Student s1 = (Student) parr[0];

        s1.getMajor();*/
        /*자식 타입의 고유 변수인 Major 접근 가능해짐 Down-Casting*/

        System.out.println(parr[0] instanceof  Student);
        System.out.println(parr[1] instanceof  Emp);
        System.out.println(parr[2] instanceof  Student);

        /*parr[0]이 Student의 객체이면 true 아니면 false*/

        System.out.println("-------------------------------------------");


        if(parr[0] instanceof Student){
            Student s1 = (Student) parr[0];
            System.out.println("학번 : " + s1.getHakbun());
        }









    }
}
