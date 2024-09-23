import java.util.*;

class firstClass {
    public static void main(String args[]) {
        System.out.println("hello worls ");
        System.out.println("age ");

        Scanner sc = new Scanner(System.in);

        // int age = sc.nextInt();

        // if (age > 18) {
        // System.out.println("Adult");
        // } else {
        // System.out.println("Not Adult");
        // }

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("a is equal");
        } else if (a > b) {
            System.out.println("a is greater");
        } else {
            System.out.println("a is lesser");
        }

    }
}
