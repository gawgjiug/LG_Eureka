package java_0617;

/*도형의 공통 정보를 저장
* */

public abstract class Shape {

    private int x,y; //기준 좌표

    public Shape(){

    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /*메서드에 abstract 선언, 블록대신 ; 작성
    * 클래스 선언부에 abstract 추가
    * abstract 메서드는 자식클래스에서 반드시 오버라이딩 해야 함*/
    abstract public void draw();
    /*추상 메서드 선언 Shape 클래스를 상속받는 모든 구체적인 클래스에서 draw()메서드는 반드시 구현되어야 함
    * */

    public void printInfo(){
        System.out.println("X : " + this.x+"\n"+
                "Y :" + this.y);
    }

}
