import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("prime number :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 2) {
            System.out.println(number + ": is not a prime");
        }
        boolean check = true;
        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println(number + ": is a prime");

        } else {
            System.out.println(number + " :is not a prime");
        }
    }

}