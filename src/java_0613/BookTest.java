package java_0613;

public class BookTest {
    public static void main(String[] args) {

        BookDto bookDto = new BookDto("자바기본","J001", 20000);

        bookDto.PrintInfo();

        /*final = 초기화 이후 수정할 수 없게 됨
        * 상수선언 : static final 타입 상수 = 초기값
        * static 을 지정하게 되면 메소드 영역의 클래스에 고정적으로 위치하게 된다
        * 이러한 것들을 정적 멤버라고 부름
        * static이 왜 필요하냐? -> 객체는 new 할때마다 만들어지지만 가끔씩 1개만 존재해야하는 시스템이 존재함
        * Ex_ 프린터 스플러(대기방) -> 프린트 완료가 되지 않은 상태로 다른 것의 요청을 받아들일 수 있음.
        * 일반적인 멤버 변수는 객체 생성 후 사용 가능 하지만 static 멤버 변수는 객체 생성 하지 않아도 사용가능
        * 불변의 값
        * */

        BookDto.pub = "민음사";
        /*이와 같이 객체를 만들 필요가 없기 때문에 클래스에 바로 접근해서 정적 변수를 사용할 수 있음
        * */
        System.out.println(BookDto.pub);

        System.out.println("-------");


        bookDto.setName("자바의 정석");
        System.out.println(bookDto.getName());

        bookDto.PrintInfo();


    }
}
