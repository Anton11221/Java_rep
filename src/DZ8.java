import java.util.Scanner;
public class DZ8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод числа n
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();


        int sum = 0;

        // Суммирование всех нечетных чисел от 1 до n
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }

        // Вывод результата
        System.out.println("Сумма нечетных чисел от 1 до " + n + " равна: " + sum);
    }
}