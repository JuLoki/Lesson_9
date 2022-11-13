public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12};
        int sum = sumRecursive(numbers, 0, 0);
        System.out.println(sum);
    }

    private static int sumRecursive(int[] numbers, int i, int sum) {
        if (i + 1 == numbers.length) {
            return sum + numbers[i];
        } else {
            return sumRecursive(numbers, i + 1, sum+numbers[i]);
        }
    }
}