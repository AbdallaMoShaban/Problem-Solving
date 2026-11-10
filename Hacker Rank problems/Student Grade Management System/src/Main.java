import java.sql.Array;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("=========================================");
        System.out.println("Press 1 to Show All Students names");
        System.out.println("Press 2 to Show all Students grades in each Subject");
        System.out.println("Press 3 to Search Student by name");
        System.out.println("Press 4 to Count Passed Students");
        System.out.print("Enter your Choice --> ");
        System.out.println("=========================================");

    }
    public static void main (String [] args){
        Scanner in =new Scanner(System.in);
        String [] name=new String[5];
        double [] sub1= new double[5];
        double [] sub2= new double[5];
        double [] sub3= new double[5];
        for (int i =0 ;i< name.length;i++){
            System.out.println("Enter Student Name number "+(i+1));
            String sName = in.nextLine();
            name[i]=sName;
        }
        for (int i =0;i<name.length;i++){
            System.out.println("Enter the grade of 3 subject of student number "+(i+1));
            System.out.println("Enter grade of subject 1");
            double grade1 =in.nextDouble();
            System.out.println("Enter grade of subject 2");
            double grade2 =in.nextDouble();
            System.out.println("Enter grade of subject 3");
            double grade3 =in.nextDouble();
            sub1[i]=grade1;
            sub2[i]=grade2;
            sub3[i]=grade3;
        }
        int choice;
        do {
            menu();
            choice=in.nextInt();
            switch (choice){
                case 1:{
                    for (String n: name){
                        System.out.println(n);
                    }

                break;
                }
                case 2:{
                    for (int i=0;i<name.length;i++){
                        System.out.println("Student Number "+(i+1));
                        System.out.println("Name "+name[i]+" Subject 1  grade "+sub1[i]+" Subject 2 grade "+sub2[i]+" Subject 3 grade "+sub3[i]);

                    }

                    break;}
                case 3:{
                    System.out.println("Enter Student Name");
                    in.nextLine();
                    String studentName =in.nextLine();
                    for (int i=0;i< name.length;i++){
                        if (studentName.equals(name[i])){
                            System.out.println("Name "+name[i]+" Subject 1  grade "+sub1[i]+" Subject 2 grade "+sub2[i]+" Subject 3 grade "+sub3[i]);

                        }
                    }


                    break;}
                case 4:{
                    int count=0;
                    for (int i=0;i< name.length;i++){
                        if (sub1[i]<50||sub2[i]<50||sub3[i]<50){
                            System.out.println("Student "+name[i]+" not passed");
                             count++;
                        }
                    }
                    System.out.println("Number of student  passed = "+(name.length-count));
                    break;}
                default:
                    System.out.println("Thank you ");
            };

        }while (choice!=0);




    }
}