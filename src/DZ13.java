import java.util.Scanner;

public class DZ13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод строки от пользователя
        System.out.print("Введите строку из слов: ");
        String inputString = scanner.nextLine();

        // Разделение строки на слова по пробелам
        String[] words = inputString.split(" ");

        // Вывод слов, состоящих только из латиницы
        System.out.println("Слова, состоящие только из латиницы:");
        int latinWordsCount = 0;
        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                System.out.println(word);
                latinWordsCount++;
            }
        }

        // Вывод количества слов, состоящих только из латиницы
        System.out.println("Количество слов, состоящих только из латиницы: " + latinWordsCount);
    }
}