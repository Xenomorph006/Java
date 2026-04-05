package Day_1;
import java.util.Scanner;

public class Reverse {

    public int rev(int a){
        int r = 0;
        while(a != 0){
            int d = a%10;
            r = r*10 + d;
            a /= 10;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reverse obj = new Reverse();

        System.out.println("Enter a number to be reversed: ");
        int a = sc.nextInt();

        System.out.println("The reversed number is: " + obj.rev(a));
        sc.close();
    }
    
}
