package pattern;

import java.util.*;

public class numberFound {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("sixe::::");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            System.out.println("numbers::::");

            numbers[i] = sc.nextInt();
        }
        System.out.println(" search number::::");

        int x = sc.nextInt();
        // output
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] == x) {
                System.out.println("answer3::::");

                System.out.println(j);
            } else {

                System.out.println("error");
            }
        }

    }
}
