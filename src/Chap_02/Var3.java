package Chap_02;

public class Var3 {
    public static void main(String[] args) {

        String s = "100";

        int i = Integer.parseInt(s);

        /*Integer 라는 class가 가지고 있는 parseInt 라는 함수를 실행
        * 시험에 나온다면 String -> int 정도 많이 쓰는 것만 나옴
        * printf 같은 것들은 언급하지 않겠다.
        * */


        System.out.println('나' - '가');
        /*나라는 글자와 가라는 글자에 존재하는 글자의 갯수*/
        System.out.println('가');
        System.out.println((int)'가');
        System.out.println((int)'나');

        /*그렇다면 가 -> 다음은?
        * */
        System.out.println((char) ('가'+ 2));




    }
}
