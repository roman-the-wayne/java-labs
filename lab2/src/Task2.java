import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int rows = 4;
        int cols = 5;


        int[][] matrix = new int[rows][cols];
        System.out.println("исходный двумерный массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(100) + 1;
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] % 2 == 0) {
                    count++;
                }
            }
        }

        System.out.print("\nКолво: "+count);
    }
}


//        int[] result = new int[count];
//        int index = 0;
//
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                if ((i + j) % 2 == 0) {
//                    result[index] = matrix[i][j];
//                    index++;
//                }
//            }
//        }
//
//
//        System.out.println("одномерный массив");
//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + " ");
//        }
//    }
//}