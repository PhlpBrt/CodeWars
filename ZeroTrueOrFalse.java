package codewarsestd;

public class ZeroTrueOrFalse {
    //https://www.codewars.com/kata/is-it-negative-zero-0/train/java

    public static boolean isNegativeZero(float n) {
        if (new Float(n).equals(-0.0f)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isNegativeZero(-0f));
        System.out.println(isNegativeZero(-5f));
        System.out.println(isNegativeZero(-4f));
        System.out.println(isNegativeZero(-3f));
        System.out.println(isNegativeZero(-2f));
        System.out.println(isNegativeZero(-1f));
        System.out.println(isNegativeZero(0f));
        System.out.println(isNegativeZero(1f));
        System.out.println(isNegativeZero(2f));
        System.out.println(isNegativeZero(3f));
        System.out.println(isNegativeZero(4f));
        System.out.println(isNegativeZero(5f));
    }
}
