package java_0617;

public class Person {
    private String name,tel;


    public Person (){

    }

    public Person(String name, String tel) {
        super();
        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void printInfo(){
        System.out.println("이름 : " + this.name +"\n"+"전화번호 : " + this.tel);
    }

}
