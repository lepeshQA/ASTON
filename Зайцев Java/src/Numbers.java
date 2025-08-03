import java.util.InputMismatchException;
import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;

      //Ввод 2 чисел с проверкой на целочисленное значение
        try {
            System.out.println("Введите первое целое число (a):");
            a = scanner.nextInt();
            System.out.println("Введите второе целое число (b):");
            b = scanner.nextInt();
            
            Compare(a, b);	
            Calculate(a, b);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введено неверное значение. Пожалуйста, введите только целые числа.");
        } finally {
            scanner.close();
        }
    }

    // Сравнивает 2 числа
    public static void Compare(int a, int b) {
        System.out.println("\n--- Сравнение чисел ---");
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }

    // Выполняет математические операции: сложение, вычитание, уножение, деление
    public static void Calculate(int a, int b) {
        System.out.println("\n--- Арифметические операции ---");
        System.out.println("Сложение: " + a + " + " + b + " = " + (a + b));
        System.out.println("Вычитание: " + a + " - " + b + " = " + (a - b));
        System.out.println("Умножение: " + a + " * " + b + " = " + (a * b));

        if (b != 0) {
            System.out.println("Деление: " + a + " / " + b + " = " + ((double) a / b));
        } else {
            System.out.println("Деление: Деление на ноль невозможно.");
        }
    }
}