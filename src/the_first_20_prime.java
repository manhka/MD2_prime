import java.util.Scanner;

public class the_first_20_prime {
    public static void main(String[] args) {
        System.out.print("enter a number:   ");
        Scanner sc= new Scanner(System.in);
        int count =0;
        int num = sc.nextInt();
        if (num<2){
            System.out.println(num+" :is not a prime");
        }else {
        for (int i = 2; count <= num; i++) {
            boolean check= true;
            for (int j = 2; j < i; j++) {
                if (i%j==0){
                    check=false;
                    break;
                }
            }if (check){
                count++;
                System.out.println(i+"is a prime");
                if (count==20){
                    break;
                }
            }
        }
    }}
}
