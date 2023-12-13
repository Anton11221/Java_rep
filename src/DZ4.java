import java.util.Scanner;

public class DZ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод трех чисел
        System.out.println("Введите три числа:");
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        float z = scanner.nextFloat();

        // Вычисление среднего арифметического
        float sa = (x + y + z) / 3;

        // Вывод среднего арифметического
        System.out.println("Среднее арифметическое: " + sa);

        // Округление среднего арифметического в меньшую сторону
        int znah = (int) Math.floor(sa / 2);

        // Проверка и вывод сообщения
        if (znah > 3) {
            System.out.println("Программа выполнена корректно");
        }
        else {
            System.out.println("Значение меньше 3");
        }
    }
}