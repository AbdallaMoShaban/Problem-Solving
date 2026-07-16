import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static int factorial(int x) {

        if (x > 1)
        {
            return x * factorial(x - 1);
        }
        else
        {
        return 1;
        }
    }

    public static void main(String[] args){
        System.out.println("Enter the number");
        int n =input.nextInt();
        System.out.println(factorial(n));
    }
}