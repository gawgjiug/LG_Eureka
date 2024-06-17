package java_0617;

public class Student_Test {
    public static void main(String[] args) {

        Student  student = new Student("곽지욱","010-1234-4567","201947003","컴퓨터공학");

        student.printInfo();

        System.out.println("------------------------------------");

        Emp emp = new Emp("곽지욱","010-5555-6666","1100","개발 1팀");
        emp.printInfo();

        System.out.println("------------------------------------");

        emp.setBuseo("경영 1팀");
        emp.printInfo();



    }
}
