package Day_1;
import java.util.Scanner;

public class Largest {
    int Largest_check (int a, int b, int c){
        if(a > b && a > c){ return a;}
        else if (b > a && b > c) { return b; }
        else { return c; }
    }

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        Largest obj = new Largest();

        System.out.print("Enter the First Number: ");
        int x = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int y = sc.nextInt();
        System.out.print("Enter the Third Number: ");
        int z = sc.nextInt();

        int res = obj.Largest_check(x, y, z);

        System.out.println("The Largest among the Three is: " + res);
        sc.close();
    }
    
}
