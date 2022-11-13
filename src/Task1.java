/*
Задача: створити два методи, для вирішення обрагного завдання за допомогою рекурсії та ітеративних алгоритмів
- написати програмний код на мові програмування Java
- завантажити результати виконання роботи на GitHub.
Дано натуральне число n. Вивести всі числа від 3 до n
 */

public class Task1 {
    public static void main(String[] args) {
        counter(3);
    }
    private static void counter(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        counter(n - 1);
    }
}
