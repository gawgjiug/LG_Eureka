package java_0617;

public class Car_Test {
    public static void main(String[] args) {

        Car car = new Car();
        FlyCar fc = new FlyCar();
        fc.fly();

        /*하늘을 나는 자동차들은 반드시 Flyable 타입이어야 한다라는 규정이 존재할 때
        * */

        Flyable flyable = new FlyCar();

        flyable.engine(); //디폴트 메서드
        flyable.fly();


        /*인터페이스 : 반드시 정의해야 하는 메서드 목록을 가져오는 것
        * 상속 : 선언된 변수 , 메서드 자동으로 추가
        *
        * 다형성은 객체 지향 프로그래밍의 중요한 개념 중 하나임.
        * 인터페이스나 상위 클래스에 대해 여러 가지 형태를 가질 수 있는 능력을 말함
        * Ex_ 오버로딩, 오버라이딩 등등*/

    }
}
