package codewarsestd;

import java.util.Scanner;

public class CenterCaracter {
// https://www.codewars.com/kata/56747fd5cb988479af000028/train/java

    public static String getMiddle(String word) {
        int a = word.length();
        if ((a % 2) != 0) {
            int n = a / 2;
            char c = word.charAt(n);
            String impar = Character.toString(c);

            return impar;
        } else {
            int n = a / 2;
            char c = word.charAt(n);
            char d = word.charAt(n - 1);
            String parUm = Character.toString(c);
            String parDois = Character.toString(d);
            String unica = (parDois + "" + parUm);
            return unica;
        }
    }

    public static void main(String[] args) {
        Scanner code = new Scanner(System.in);
        String test;
        System.out.println("Escreva a palavra que deseja: ");
        test = code.next();
        System.out.println(getMiddle(test));

    }
}
