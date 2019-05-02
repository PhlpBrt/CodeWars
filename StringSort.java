package codewarsestd;

public class StringSort {
    //https://www.codewars.com/kata/two-to-one/train/java

    public static String longest(String s1, String s2) {
        String saida = "";
        String top = s1 + s2;
        for (char i = 'a'; i <= 'z'; i++) {
            if (top.contains(i + "")) {
                saida += i;
            }
        }
        return saida;
    }

    public static void main(String[] args) {
        System.out.println(longest("asasdffad", "sdacjuh"));
    }
}
