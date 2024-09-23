import java.util.*;

@SuppressWarnings("unused")
public class oddNumber {

    public static void main(String args[]) {

        System.out.println("Number : ");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
