import java.util.Scanner;

public class DZ7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размера массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        // Ввод элементов массива
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Сравнение элементов массива с константами
        int x = 10;
        int y = 20;
        int z = 30;
        boolean constant = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == x || array[i] == y || array[i] == z) {
                System.out.println("Массив содержит значение: " + array[i]);
                constant = true;
            }
        }

        // Вывод результата
        if (constant) {
            System.out.println("Данное значение имеется в константах");
        } else
            System.out.println("Константы в массиве не найдены");
    }
}
