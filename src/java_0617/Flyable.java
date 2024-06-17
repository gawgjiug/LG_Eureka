package java_0617;

public interface Flyable {

    public void fly();
    //존재해야 하는 메서드

    default void engine(){
        System.out.println("시동 걸기.....");
    }

    static void printInfo(){
        System.out.println("이것은 Flyable 인터페이스이다");
    }

}
