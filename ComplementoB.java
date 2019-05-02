package codewarsestd;

public class ComplementoB {
//https://www.codewars.com/kata/a-plus-b-equals-equals-123/train/java
    public static long int123(final int a) {

        return Integer.toUnsignedLong(123 - a);

    }

    public static void main(String[] args) {
        System.out.println(int123(10));
        System.out.println(int123(123));
        System.out.println(int123(500));

    }
}
