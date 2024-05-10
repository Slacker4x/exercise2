import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Считываем 3 числа
        System.out.print("Введите значение a: ");
        int a = scanner.nextInt();
        System.out.print("Введите значение b: ");
        int b = scanner.nextInt();
        System.out.print("Введите значение c: ");
        int c = scanner.nextInt();

        // Проверяем, есть ли значения, кратные 5
        if (a % 5 == 0 || b % 5 == 0 || c % 5 == 0){
            System.out.println("a=" + a + ", b=" + b + ", c=" + c);
        } else {
            System.out.println("Нет значений кратных 5");
        }

        // Целочисленное деление
        System.out.println(a / b);

        // Результат деления с плавающей запятой
        System.out.println((double) a / b);

        // Деление, с округлением до ближайшего целого в большую сторону
        System.out.println(Math.ceil((double) a / b));

        // Деление, с округлением до ближайшего целого в меньшую сторону
        System.out.println(Math.floor((double) a / b));

        // Деление, с округлением до целого математическим округлением
        System.out.println(Math.round((double) a / b));

        // Вывод остатка от деления
        System.out.println(b % c);

        // Выврд наименьшего значения
        System.out.println(Math.min(a, b));

        // Вывод наибольшего значения
        System.out.println(Math.max(b, c));

        scanner.close();
    }
}