package UD3;

import java.util.Arrays;

public class ArrayFill {

    public static void main(String[] args) {
        int contador = 0;
        int[] array = new int[55];

        for (int i = 1; i < 11 ; i++){
            Arrays.fill(array,contador,contador+i,i);
            contador += i;
        }

        System.out.println(Arrays.toString(array));
    }
}
