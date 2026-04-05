package Day_1;
import java.util.Scanner;

public class Prime {
    boolean hect (int a){
        boolean o = true;
        if ( a <= 1) o = false;
        else{
            for( int i =2; i < a; i++ ){
                if(a % i == 0){
                    o = false;
                    break;
                }
            }
        }
        return o;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prime obj = new Prime();

        System.out.print("Enter a Number to check whether it is Prime or Not: ");
        int x = sc.nextInt();

        if(obj.hect(x)) System.out.println(x + " is Prime.");
        else System.out.println(x + " is not Prime.");

        sc.close();
    }
    
}
