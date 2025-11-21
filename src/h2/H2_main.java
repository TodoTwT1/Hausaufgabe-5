package h2;

import java.util.Arrays;
import java.util.Set;

public class H2_main {
    public static void main(String[] args) {

        int n = 299;
        int digits = 12;
        int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        digits = 0;

        if (n == 0) {
            digits = 1;
        } else
            while (n > 0) {
                a[8-digits]=n%10;
                n = n / 10;
                digits++;
            }

                System.out.println(digits);
            System.out.println(Arrays.toString(a));

    }
}
