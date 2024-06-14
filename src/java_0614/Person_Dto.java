package java_0614;

/*학생과 직원의 공통변수 정의용 */
public class Person_Dto {


    private String name; /*이름*/

    //전화
    private String tel;

    Person_Dto(String name, String tel){

        this.name = name;
        this.tel = tel;

    }
    Person_Dto(){

    }

    public String getName(){
        return this.name;
    }

    /*직접접근을 피하고 값을 접근하도록 하기 위해 get,set 장치를 사용함*/
    public void setName(String name){
        this.name = name;
    }

    public String getTel(){
        return this.tel;
    }
    public void setTel(String tel){
        this.tel = tel;
    }

    /*public 은 어디서나 접근 가능함
    * private class 내부에서만 가능*/

    public void printInfo(){
        System.out.println("이름 = " + this.name);
        System.out.println("전화번호 = " + this.tel);
    }

}
