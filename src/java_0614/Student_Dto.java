package java_0614;

/*학생 클래스*/
public class Student_Dto extends Person_Dto {

    private String hakbun;
    private String major;

    public Student_Dto(String name, String tel, String hakbun, String major) {
        super(name, tel);
        /**/
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

    public void printInfo(){
        super.printInfo();
        System.out.println("학번 : " + this.hakbun +
                "\n" + "전공 : " + this.major);
    }



}
