import java.util.Scanner;

public class Lesson4Prog1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int modulo = number % 2;

        if (modulo == 0) {
            System.out.println("Число четное!");
        }
        else {
            System.out.println("Число нечетное!");
        }
    }
}
