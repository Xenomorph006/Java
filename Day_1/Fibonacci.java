package Day_1;
import java.util.Scanner;
public class Fibonacci {

    void series(int a){
        int x =0; int y = 1;
        System.out.println(x + "\n" + y);
        for (int i =2; i < a; i++){
            int z = x + y;
            System.out.println(z);
            x = y;
            y = z;
        }
    }

    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range for the Fibonacci series: ");
        int a = sc.nextInt();
        obj.series(a);
        sc.close();
    }
    
}
