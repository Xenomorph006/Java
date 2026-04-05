package Day_1;
import java.util.Scanner;

public class Factorial {
    public int fact(int a){
        if(a == 0) {
            return 0;
        }
        else if(a == 1){
            return 1;
        }
        else if(a == 2){
            return 2;
        }
        else{
            return a * fact(a-1);
        }
    }
    
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        Factorial obj = new Factorial();

        System.out.print("Enter the Number for Factorial: ");
        int a = sc.nextInt();

        int c = obj.fact(a);

        System.out.println("The Factorial of " + a + " is: " + c);
        sc.close(); 
    }
}
