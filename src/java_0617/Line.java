package java_0617;

public class Line extends Shape {


    private int x2,y2;


    public Line (){

    }

    public Line(int x2, int y2) {
        this.x2 = x2;
        this.y2 = y2;
    }

    public Line(int x, int y, int x2, int y2) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("X2 : " + this.x2+"\n"+
                "Y2 : " + this.y2);
    }

    public void draw() {

        System.out.println("x2 : " + x2 +"\n"+
        "y2 : " + y2 );
    }


}
