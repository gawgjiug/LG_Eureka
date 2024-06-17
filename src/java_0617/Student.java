package java_0617;

public class Student extends Person {

    private String hakbun,major;

    public Student (){

    }

    public Student(String hakbun, String major) {
        this.hakbun = hakbun;
        this.major = major;
    }

    public Student(String name, String tel, String hakbun, String major) {
        super(name, tel);
        this.hakbun = hakbun;
        this.major = major;
    }

    public String getHakbun() {
        return hakbun;
    }

    public void setHakbun(String hakbun) {
        this.hakbun = hakbun;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void printInfo (){
        super.printInfo();

        System.out.println("학번 : " + this.hakbun + "\n" +
                "전공은 : " + this.major);
    }
}
