import java.util.Scanner;

public  class Main {
    public  static  void menu(){
        System.out.println("=============ATM===========");
        System.out.println("Press 1 to Check Balance");
        System.out.println("Press 2 to Deposit ");
        System.out.println("Press 3 to Withdraw ");
        System.out.println("Press 4 to Show Account Status ");
        System.out.println("Press 0 to Exit ");
        System.out.print("Enter your Choice --> ");
        System.out.println("===========================");
    }
    public static void main(String [] args){
        Scanner in =new Scanner(System.in);
        double initialBalance=2500.00;
        byte attempt=0;
        int pass = 1234;
        boolean isTrue=false;

        do {
            System.out.println("Enter Password");
            int password =in.nextInt();
            if (password==pass){
                System.out.println("Password is true ");
                isTrue=true;
            }
            else {
                System.out.println("PassWord is false");
                attempt++;
            }
        }while (attempt!=3&&!isTrue);
        if (attempt==3){
            System.out.println("Your account is locked");


        }
        else {
            int choice;
            do {
                menu();
                choice = in.nextInt();
                switch (choice) {
                    case 1: {
                        System.out.println("Your Balance is " + initialBalance);
                        break;
                    }
                    case 2: {
                        System.out.println("Enter the amount must greater than 0");
                        double amount = in.nextDouble();
                        if (amount > 0) {
                            initialBalance += amount;
                            System.out.println("Successful Deposit");
                        } else System.out.println("invalid amount");
                        break;
                    }
                    case 3: {
                        System.out.println("Enter the amount to withDraw");
                        double amount =in.nextDouble();
                        if (amount <= initialBalance) {
                            initialBalance -= amount;
                            System.out.println("Successful");
                        } else System.out.println("an error ");
                        break;

                    }
                    case 4: {
                        if (initialBalance >= 5000) System.out.println("VIP Customer");
                        else if (initialBalance >= 1000 && initialBalance <= 4999.99) {
                            System.out.println("Regular Customer");
                        } else System.out.println("low Balance ");
                        break;
                    }
                    default:
                        System.out.println("Thank you ");
                }
            } while (choice != 0);

        }

    }
}