import java.util.Scanner;

public class DZ6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Предлагаем пользователю выбрать массу или расстояние
        System.out.println("Выберите что переводить:\n1 - масса\n2 - расстояние");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Считываем символ новой строки после ввода числа

        // Проверяем выбор пользователя и переходим в соответствующий конвертер
        if (choice == 1) {
            System.out.println("Вы вошли в конвертор масс");
            massConverter();
        } else if (choice == 2) {
            System.out.println("Вы вошли в конвертор расстояний");
            distanceConverter();
        } else {
            System.out.println("Некорректный выбор");
        }
    }

    //Конвертор Масс
    public static void massConverter() {
        Scanner scanner = new Scanner(System.in);

        //Запрос выбора единицы измерения
        System.out.println("Выберите единицу измерения массы: 1 - килограмм, 2 - фунт, 3 - унция");
        int choice = scanner.nextInt();

        //Запрос значения массы
        System.out.println("Введите значение массы:");
        double quantity = scanner.nextDouble();

        //Создаем переменные
        double kilograms = 0;
        double pounds = 0;
        double ounces = 0;

        //Определяем сценарии трансформации
        switch (choice) {
            case 1:
                kilograms = quantity;
                pounds = quantity * 2.20462;
                ounces = quantity * 35.274;
                break;
            case 2:
                kilograms = quantity * 0.453592;
                pounds = quantity;
                ounces = quantity * 16;
                break;
            case 3:
                kilograms = quantity * 0.0283495;
                pounds = quantity * 0.0625;
                ounces = quantity;
                break;
            default:
                System.out.println("Неверный выбор");
                System.exit(0);
        }

        //Выводим результаты
        System.out.println("Результат:");
        System.out.println("Килограммы: " + kilograms);
        System.out.println("Фунты: " + pounds);
        System.out.println("Унции: " + ounces);
    }


    //Конвертор расстояний
    public static void distanceConverter() {
        Scanner scanner = new Scanner(System.in);

        //Выбор единицы измерения
        System.out.println("Выберите единицу измерения расстояния: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        int choice = scanner.nextInt();

        //Запрос значения расстояния
        System.out.println("Введите значение расстояния:");
        double quantity = scanner.nextDouble();

        //Определяем переменные
        double meters = 0;
        double miles = 0;
        double yards = 0;
        double feet = 0;

        //Создаем сценарии решения
        switch (choice) {
            case 1:
                meters = quantity;
                miles = quantity * 0.000621371;
                yards = quantity * 1.09361;
                feet = quantity * 3.28084;
                break;
            case 2:
                meters = quantity * 1609.34;
                miles = quantity;
                yards = quantity * 1760;
                feet = quantity * 5280;
                break;
            case 3:
                meters = quantity * 0.9144;
                miles = quantity * 0.000568182;
                yards = quantity;
                feet = quantity * 3;
                break;
            case 4:
                meters = quantity * 0.3048;
                miles = quantity * 0.000189394;
                yards = quantity * 0.333333;
                feet = quantity;
                break;
            default:
                System.out.println("Неверный выбор");
                System.exit(0);
        }

        //Выводим результаты
        System.out.println("Результат:");
        System.out.println("Метры: " + meters);
        System.out.println("Мили: " + miles);
        System.out.println("Ярды: " + yards);
        System.out.println("Футы: " + feet);
    }
}