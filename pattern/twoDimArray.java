package pattern;

import java.util.*;

public class twoDimArray {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("take row::::::");

        // int rows = sc.nextInt();
        // System.out.println("take col::::::");

        // int col = sc.nextInt();

        // int[][] numbers = new int[rows][col];

        // // input
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < col; j++) {
        // numbers[i][j] = sc.nextInt();
        // }
        // }

        // // o/p
        // System.out.print("answers");
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < col; j++) {
        // System.out.print(numbers[i][j]);

        // }
        // System.out.println();

        // }

        // return;

        int rows = 4;
        int columns = 4;

        int[][] array = new int[rows][columns];

        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = value;
                value++;
            }
        }

        System.out.println("The 2D array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
