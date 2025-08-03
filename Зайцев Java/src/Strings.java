import java.util.Scanner;

public class Strings{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите первую строку:");
        String a = scanner.nextLine();
        System.out.println("Введите вторую строку:");
        String b = scanner.nextLine();

        compareStrings(a, b);
        scanner.close();
    }

    // Сравнивает 2 строки
    public static void compareStrings(String a, String b) {
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}