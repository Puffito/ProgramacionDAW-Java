package UD3;

public class PasarArrayAOtro {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for(int i = 0 ; i < array1.length ; i++){
            array1[i] = i +1;
        }

        for(int i = array1.length ; i > 0 ; i--){
            array2[10-i] = array1[i-1];
        }

        for(int i : array1){
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i : array2){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
