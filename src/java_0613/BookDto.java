package java_0613;

public class BookDto {

    String name;
    String isbn;
    int price;


    BookDto (String name, String isbn , int price){
        this.name = name;
        this.isbn = isbn;
        this.price = price;

    }


    public void PrintInfo() {
        System.out.println("책 제목 : " + this.name + "\n"+ "isbn 코드는 : " + this.isbn + "\n" + "가격은 : " + this.price + "입니다");

    }
}
