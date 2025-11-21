package h1;

import java.util.Arrays;

public class H1_main {
    public static void main(String[] args) {


        int[] myArray = {1, 2, 3, 4};

        for (int i = 0; i < myArray.length / 2; i++) {
            int temp = myArray[i];
            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(myArray));






    }
}
