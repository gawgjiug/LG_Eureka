package java_0621;

public class Emp implements Comparable <Emp>  {
    int sabun;
    String name;

    public Emp(int sabun, String name) {
        this.sabun = sabun;
        this.name = name;
    }

    //내부 변수값 출력

    @Override
    public String toString() {
        return "Emp{" +
                "sabun=" + sabun +
                ", name='" + name + '\'' +
                '}';
    }



    /*sout 은 콘솔 출력이라서 활용성이 떨어짐 */

    public Emp(){

    }

    @Override
    public int compareTo(Emp o) {
        //return this.비교변수 - o.비교변수
        return this.sabun - o.sabun;
    }
}
