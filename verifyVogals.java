package codewarsestd;

import java.util.Scanner;

public class verifyVogals {
//https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/java

    public static int getCount(String str) {
        int vowelsCount = 0;

        str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    public static void main(String[] args) {
        Scanner code = new Scanner(System.in);
        String test;
        System.out.println("Escreva a palavra que deseja: ");
        test = code.next();
        System.out.println(getCount(test));
    }

}
