import java.util.Scanner;

public class DZ5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число a: ");
        int a = scanner.nextInt();

        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        System.out.print("Введите символ операции (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        int result = 0;

        switch(operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Некорректный символ операции.");
                return;
        }

        System.out.println("Результат: " + result);
    }
}