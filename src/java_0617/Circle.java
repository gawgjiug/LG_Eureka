package java_0617;

public class Circle extends Shape {

    private int x3,y3;

    public Circle(int x3, int y3) {
        this.x3 = x3;
        this.y3 = y3;
    }

    public Circle(int x, int y, int x3, int y3) {
        super(x, y);
        this.x3 = x3;
        this.y3 = y3;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }
    public void draw(){
        System.out.println("x3 :" + x3 +"\n"+
                "y3 : " + y3);
    }
    /*추상메서드 drwa()구현해야함*/
}
