package Day_1;
import java.util.Scanner;


public class Check {
    void check(int a){
        if( a%2 == 0){ System.out.println("Even"); }
        else{ System.out.println("Odd");}
    }

    public static void main(String args []){
        Check obj = new Check();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Number to check Even or Odd: ");
        int a = sc.nextInt();

        obj.check(a);
        sc.close();
    }
    
}
