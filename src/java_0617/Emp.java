package java_0617;

public class Emp extends Person{
    private String sabun,buseo;


    public Emp(){

    }

    public Emp(String sabun, String buseo) {
        this.sabun = sabun;
        this.buseo = buseo;
    }

    public Emp(String name, String tel, String sabun, String buseo) {
        super(name, tel);
        this.sabun = sabun;
        this.buseo = buseo;
    }

    public String getSabun() {
        return sabun;
    }

    public void setSabun(String sabun) {
        this.sabun = sabun;
    }

    public String getBuseo() {
        return buseo;
    }

    public void setBuseo(String buseo) {
        this.buseo = buseo;
    }

    public void printInfo   (){
        super.printInfo();
        System.out.println("사번 : " + this.sabun + "\n"+"부서 :" + this.buseo);
    }
}
