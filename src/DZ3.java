public class DZ3 {
    public static void main(String[] args) {
        int[] num = {1, 2, 5, 4, 5};

        // Меняем местами первый и последний элемент
        int temp = num[0];
        num[0] = num[num.length - 1];
        num[num.length - 1] = temp;

        // Вычисляем сумму первого и среднего элемента
        int sum = num[0] + num[num.length / 2];

        System.out.println("Сумма первого и среднего элемента: " + sum);
    }
}
