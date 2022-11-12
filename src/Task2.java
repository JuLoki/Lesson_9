public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 7, 1, 10};
        int sum = 0;
        for (int x: numbers) {
            sum += x;
        }
        System.out.println(sum);
    }
}







  /*      sum(numbers);
        int sum = 0;
        sumRecursive(numbers, sum);
        System.out.println(sum);

    }
    private static void sumRecursive(int[] numbers, int sum) {
        if (numbers.length == 0){
            return;
        }
        sum += sumRecursive
    }

    private static void sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}*/