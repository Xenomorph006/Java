package Day_1;
import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Reverse b1 = new Reverse();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check whether it is Pallindrome or not: ");
        int x = sc.nextInt();

        int y = b1.rev(x);
        if( x == y){ System.out.println(x + " is Pallindrome.");}
        else{ System.out.println(x + " is not Pallindrome.");}

        sc.close();
    }
}
