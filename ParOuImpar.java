package codewarsestd;
//https://www.codewars.com/kata/odd-or-even/train/java

import java.util.Scanner;

public class ParOuImpar {

    public static String oddOrEven(int[] array) {
        int soma = 0;
        for (int i = 0; i < array.length; i++) {

            soma += array[i];
        }
        if (soma % 2 != 0) {
            return "odd";
        } else {
            return "even";
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        x = 5;
        int[] array = new int[x];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        System.out.println(oddOrEven(array));
    }
}
