/*

 */

public class Task1 {
    public static void main(String[] args) {
        counter(1);
    }
    private static void counter(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        counter(n - 1);
    }
}
