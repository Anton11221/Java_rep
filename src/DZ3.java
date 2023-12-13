public class DZ3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 5, 4, 5};

        // Поменять местами первый и последний элемент
        int temp = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = temp;

        // Вычислить сумму первого и среднего элемента
        int sum = numbers[0] + numbers[numbers.length / 2];

        // Вывести результат в консоль
        System.out.println("Сумма первого и среднего элемента: " + sum);
    }
}
