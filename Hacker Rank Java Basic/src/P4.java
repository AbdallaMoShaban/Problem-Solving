import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array= new String[4];
        int[] array1= new int[4];
        for (int i =0; i<3;i++)
        {

                String x  = input.next();
                int y = input.nextInt();
                array[i]=x;
                array1[i]=y;
        }
        System.out.println("================================");
        for (int i =0 ;i<3;i++)
        {
        String f = String.format("%03d",array1[i]);

        System.out.printf("%-15s%03d\n", array[i], array1[i]);
        }

        System.out.println("================================");
    }

}




