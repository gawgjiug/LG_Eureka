package java_0614;

/*학생 클래스*/
public class Student_Dto extends Person_Dto {

    /*자바는 다중 상속 허용하지 않음 하나의 부모만 상속할 수 있음
    * */

    private String hakbun;
    private String major;

    public Student_Dto(String name, String tel, String hakbun, String major) {
        super(name, tel);
        /**/
       /* super();
       * 는 매개변수가 없는 '기본' 생성자 호출을 의미함*/
        this.hakbun = hakbun;
        this.major = major;
    }



    public String getHakbun() {
        return hakbun;
    }

    public void setHakbun(String hakbun) {
        this.hakbun = hakbun;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("학번 : " + this.hakbun +
                "\n" + "전공 : " + this.major);
    }

    /*메소드 오버로딩
    * - 목적 : 비슷한 기능을 데이터 타입을 다르게 구현하는 것
    * 같은 이름이지만 다른 매개변수를 선언하는..
    *
    * ex_ print() , print(int i) ,print (String s)
    *
    * 메서드 오버라이딩
    * - 목적 :  자식 클래스에서 부모 클래스의 동알한 메서드의 동작을 재 정의
    * - 자식 클래스에서 부모 클래스내의 특정 메서드와 같은 이름, 동일한 매개변수 선언하고 내부동작을 부모와 다르게 구현하는 것.
    * Ex_ Person class -> printInfo () : name,tel 출력
    * but StudentDto extends Person
    * PrintInfo () : name , tel, hakbun 등등 출력*/



}
