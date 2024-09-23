import java.util.*;

public class switchs {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int colorNum = sc.nextInt();

        switch (colorNum) {

            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("default");
        }
    }
}
