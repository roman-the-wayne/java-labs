import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите размер массива: ");
        int c = scanner.nextInt();
        int[] mas = new int[c];

        for (int i = 0; i < c; i++) {
            mas[i] = scanner.nextInt();
        }

        int last = mas[mas.length - 1];
        int[] newMas = new int[c];
        newMas[0] = last;

        for (int i = 1; i < mas.length; i++) {
            newMas[i] = mas[i - 1];
        }


        System.out.print("результат: ");
        for (int i = 0; i < newMas.length; i++) {
            System.out.print(newMas[i] + " ");
        }

        scanner.close();
    }
}