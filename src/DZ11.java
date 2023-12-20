import java.util.Scanner;

public class DZ11
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод первого числа
        System.out.print("Введите первое число: ");
        String firstNumberStr = scanner.nextLine();

        // Ввод второго числа
        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        // Конвертирование первого числа из строки в целочисленный тип
        int firstNumber = Integer.parseInt(firstNumberStr);

        // Сравнение и вывод большего числа
        if (firstNumber > secondNumber) {
            System.out.println("Большее число: " + firstNumber);
        } else {
            System.out.println("Большее число: " + secondNumber);
        }

        // Конвертирование меньшего числа в тип double и вывод на экран
        double smallerNumber = Math.min(firstNumber, secondNumber);
        System.out.println("Меньшее число: " + (double) smallerNumber);
    }
}