package java_0611;

public class Break_Test {
    public static void main(String[] args) {


        int sum = 0;
        for(int i = 1; i<= 100; i++){

            if(sum > 100){
//                break;
                continue; //반복문 선언부로 이동
            }

            sum += i;
        }
        System.out.println(sum);

        /*hello.java 를 컴파일하면 hello.class 로 바꿔서
        * pc 밥통 냉장고 로 보내면 각각의 기기에서 VM이 class file을 이해하고 번역함 ->기계어로
        * 성능 보다는 호환성 위주 -> cpu 성능이 매우 발달 했기 때문
        *
        * 필요한 클래스를 모아놓는 구역 = 메소드 영역
        * 이 것을 실행하면 class 안에 main 메소드를 찾는데, 함수를 실행하기 위해선 스택 영역에 올려놔야 함.
        * 함수를 실행하다 보면 함수,객체 등을 생성하게 되는데, 이러한 것들은 힙 공간에서 이루어짐
        * 힙 공간에 만들어지는 것들의 특징 -> new 를 사용함  */

    }
}
