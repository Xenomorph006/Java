package Day_1;
import java.util.Scanner;

public class Sum {
    int add(int a, int b){
        return (a + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sum obj = new Sum();

        System.out.print("Enter the Number_1: ");
        int a = sc.nextInt();
        System.out.print("Enter the Number_2: ");
        int b = sc.nextInt();
        int c = obj.add(a,b);

        System.out.println("The Sum is: " + c);
        sc.close();
    }
}
