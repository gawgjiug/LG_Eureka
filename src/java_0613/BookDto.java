package java_0613;

public class BookDto {


    private String name;
    private String isbn;
    private int price;

    /*캡슐화*/

    /*정적 변수*/

    static String pub ; /*static 출판사*/


    BookDto (String name, String isbn , int price){
        this.name = name;
        this.isbn = isbn;
        this.price = price;

    }
    public String getName(){
        return this.name = name;
    }
    public void setName(String name){
        this.name= name;
    }


    public void PrintInfo() {
        System.out.println("책 제목 : " + this.name + "\n"+ "isbn 코드는 : " + this.isbn + "\n" + "가격은 : " + this.price + "입니다");

    }

    /*상속 : 코딩 양을 줄이기 위해서 사용하는 기술
    * Ex) 관리할 데이터 정의
    * 어떤 것을 관리(저장, 수정, 삭제,검색) -> CRUD라고 부름
    * C - Create
    * R - Read
    * U - Update
    * D - Delete*/
}
