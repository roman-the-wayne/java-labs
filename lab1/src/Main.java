import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nВыберите задачу:");
            System.out.println("1 перевести метры в сантиметры");
            System.out.println("2 найти количество положительных чисел среди трех введенных");
            System.out.println("3 найти наименьшее общее кратное (НОК) двух чисел");
            System.out.println("4 выйти");
            System.out.print("ваш выбор: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("введите количество метров: ");
                    double meters = scanner.nextDouble();
                    double centimeters = meters * 100;
                    System.out.println(meters + " м = " + centimeters + " см");
                    break;
                case 2:
                    System.out.print("введите первое число: ");
                    int num1 = scanner.nextInt();
                    System.out.print("введите второе число: ");
                    int num2 = scanner.nextInt();
                    System.out.print("введите третье число: ");
                    int num3 = scanner.nextInt();
                    int positiveCount = 0;
                    if (num1 > 0) positiveCount++;
                    if (num2 > 0) positiveCount++;
                    if (num3 > 0) positiveCount++;
                    System.out.println("воличество положительных чисел: " + positiveCount);
                    break;
                case 3:
                    System.out.print("введите первое число: ");
                    int a = scanner.nextInt();
                    System.out.print("введите второе число: ");
                    int b = scanner.nextInt();
                    int gcd = 1;
                    int tempA = Math.abs(a);
                    int tempB = Math.abs(b);
                    while (tempB != 0) {
                        int temp = tempB;
                        tempB = tempA % tempB;
                        tempA = temp;
                    }
                    gcd = tempA;
                    int lcm = (gcd == 0) ? 0 : Math.abs(a * b) / gcd;
                    System.out.println("НОК чисел " + a + " и " + b + " равен: " + lcm);
                    break;
                case 4:
                    running = false;
                    System.out.println("программа завершена");
                    break;
                default:
                    System.out.println("неверный пункт меню");
                    break;
            }
        }
        scanner.close();
    }
}
