package codewarsestd;

public class SumDigits {
//https://www.codewars.com/kata/sum-of-digits-slash-digital-root/train/java

    public static int digital_root(int n) {
        if (n < 10) {
            return n;
        } else {
            int j;
            j = (n / 10) + (n % 10);
            if (j > 10) {
                return digital_root(j / 10) + (j % 10);

            } else {
                return digital_root(n / 10) + (n % 10);
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(digital_root(16));
        System.out.println(digital_root(456));
    }
}
