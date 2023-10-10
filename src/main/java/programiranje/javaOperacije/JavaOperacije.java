package programiranje.javaOperacije;

import java.sql.SQLOutput;

public class JavaOperacije {
    public static void main(String[] args) {
        int sum1 = 100 + 200;
        int sum2 = sum1 + 200;
        int sum3 = sum2 + sum1;

        System.out.println(sum3);
        System.out.println(sum1 >= sum2);
        System.out.println(sum1 > 3 && sum2 <1);
        System.out.println(sum1 > 3 || sum2 <1);
        System.out.println(!(sum1 > 3 || sum2 <1));

        int x = 5;
        -- x;

        System.out.println(x);


    }
}
