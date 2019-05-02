package codewarsestd;

public class SomaMultiplos {
//https://www.codewars.com/kata/multiples-of-3-or-5/train/java
    public static int solution(int number) {

        int x = 3;
        int z = 5;
        int res = 0;

        for (int i = 0; i < number; i++) {
            if (i % x == 0 || i % z == 0) {
                res += i;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        System.out.println(solution(9));
    }
}
