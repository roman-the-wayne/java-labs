import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку:\n");

        String str = scanner.nextLine();

        System.out.print("Введите букву:\n");

        char lit = scanner.next().charAt(0);

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == lit) {
                System.out.print("Обнаружено вхождение буквы: '" + lit + "' на индексе: " + i + "\n");
            }
        }
    }
}
