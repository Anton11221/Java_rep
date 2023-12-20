import java.util.Scanner;

public class DZ10
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размерности матрицы
        System.out.print("Введите количество строк: ");

        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        // Ввод элементов матрицы
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Первая строка матрицы, умноженная на 3:");
        for (int j = 0; j < columns; j++) {
            System.out.print(matrix[0][j] * 3 + " ");
        }
    }
}