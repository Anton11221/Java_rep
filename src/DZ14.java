import java.util.Random;

public class DZ14 {
    public static void main(String[] args) {
        // Создание массива из 15 элементов
        int[] arr = new int[15];

        // Заполнение массива случайными значениями в диапазоне от -20 до 20
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(41) - 20;
           }

        // Вывод значений массива в одну строку
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Вывод максимального и минимального элемента массива
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);

        // Вычисление наибольшего по модулю значения максимального и минимального элемента
        int absMax = Math.max(Math.abs(max), Math.abs(min));
        System.out.println("Наибольшее по модулю: " + absMax);
    }
}