package java_0614;

public class Board_Dtd {

    private int no; //게시물 번호
    private String title;
    private String writerId;
    private String writeDate;
    private String content; //게시물 본문

    public Board_Dtd(){

    }

    public Board_Dtd(int no, String title, String writerId, String writeDate, String content) {
        this.no = no;
        this.title = title;
        this.writerId = writerId;
        this.writeDate = writeDate;
        this.content = content;
    }

    public int getNo() {
        return this.no;
    }
    public void setNo(int no) {
        this.no = no;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriterId() {
        return writerId;
    }

    public void setWriterId(String writerId) {
        this.writerId = writerId;
    }

    public String getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(String writeDate) {
        this.writeDate = writeDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /*모든 변수 값을 출력하는 메서드*/

    public void printInfo (){
        System.out.println("글 작성 번호 : " + this.no + "\n" + "제목 : " + this.title + "\n" + "작성자 id : " + this.writerId );
        System.out.println("작성일 : " + writeDate + "\n" + "본문 내용" + "\n" + this.content);
    }


}
