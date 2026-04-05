package Day_1;
import java.util.Scanner;

public class Count {
    int count(int a){
        int z = 0;
        while (a != 0){
            a /= 10;
            z++;

        }
        return z;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Count obj = new Count();

        System.out.print("Enter an Integer: ");
        int a = sc.nextInt();

        System.out.println("The length of " + a + " is: " + obj.count(a));
        sc.close();
    }
}
