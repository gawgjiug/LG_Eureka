package java_0621;

import java.util.Arrays;

public class Emp_Test {
    public static void main(String[] args) {
        Emp [] earr    = new Emp[3];

        earr[0] = new Emp(999,"박");
        earr[1] = new Emp(100,"홍");
        earr[2] = new Emp(101,"김");

        Arrays.sort(earr);

        System.out.println(Arrays.toString(earr));

    }
}
