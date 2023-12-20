public class
DZ12 {
    public static void main(String[] args) {
        String str = "I like Java!!!";

        // Проверка, содержит ли строка подстроку "Java"
        if (str.contains("Java")) {
            System.out.println("Строка содержит подстроку \"Java\"");
        }

        // Проверка, начинается ли строка с подстроки "I like"
        if (str.startsWith("I like")) {
            System.out.println("Строка начинается с подстроки \"I like\"");
        }

        // Проверка, заканчивается ли строка с подстроки "!!!"
        if (str.endsWith("!!!")) {
            System.out.println("Строка заканчивается подстрокой \"!!!\"");
        }

        // Если все предыдущие условия верны, вывести строку в верхнем регистре
        if (str.contains("Java") && str.startsWith("I like") && str.endsWith("!!!")) {
            String upperCaseStr = str.toUpperCase();
            System.out.println("Строка в верхнем регистре: " + upperCaseStr);
        }

        // Заменить символы 'a' на 'o' и вывести подстроку "Jovo"
        String replacedStr = str.replace('a', 'o');
        String substring = replacedStr.substring(7, 11);
        System.out.println("Подстрока \"Java\" с заменой символов 'a' на 'o': " + substring);
    }
}