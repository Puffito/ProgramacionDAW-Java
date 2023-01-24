package UD3;

import java.util.Arrays;

public class Matriz25 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (5 * i) + (j + 1);
            }
        }
        for (int[] numero : matriz) {
            System.out.println(Arrays.toString(numero) + " ");
        }
    }
}
