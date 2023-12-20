import java.util.Scanner;

public class DZ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размера массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        // Ввод элементов массива
        double[] array = new double[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        // Вычисление среднего арифметического
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        double average = sum / size;
        System.out.println("Среднее арефметическое равно = " +
                average);

        // Умножение элементов массива на среднее арифметическое
        for (int i = 0; i < size; i++) {
            array[i] *= average;
        }

        // Вывод массива на экран
        System.out.println("Массив, умноженный на среднее арифметическое:");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}