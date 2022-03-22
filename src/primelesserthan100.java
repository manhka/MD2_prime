import java.util.Scanner;

public class primelesserthan100 {
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for (int i = 2; count <= num; i++) {
            boolean check = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;

                if (i < 100) {
                    System.out.println(i + " :is a number");

                } else {
                    break;
                }

            }
        }
    }
}
