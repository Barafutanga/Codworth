package Projects.Codworth.bin;

import java.util.Scanner;
import java.util.Locale;

public class mainProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //credits
        int id = 2021221639;
        String coder = "Antônio Otaviano";

        //introduction
        System.out.printf(
                "CODWORTH, MADE BY PIMBA ENTERPRISE\nMain Programmer: %s [ID: %d]\nPDF Presentation: %s\nPDF Manual: %s\nVideo recording: %s\nVideo editor: %s",
                coder, id, coder, coder, coder, coder);
        System.out.println(
                "WELCOME TO CODWORTH SLAV, I MEAN, EMPLOYEE FINANCYS!\nFIRST OF ALL, WHAT OPERATION YOU WANT TO DO? (DIGIT ONE OF VALUES BELOW)");
        System.out.println("1- hire employee\n2- fire employee\n3- employees status");
        System.out.printf("OPERATION SELECTED: ");

        int task = sc.nextInt();
        System.out.println();

        
        //task1
        if (task == 1) {
            
            salaryStats WorkerStats = new salaryStats();
            String nameDeb;
            System.out.print("Employee name: ");
            nameDeb = sc.nextLine();

            System.out.print("Gross salary: ");
            WorkerStats.grossSalary = sc.nextDouble();

            System.out.print("Tax: ");
            WorkerStats.taxSalary = sc.nextDouble();

            System.out.println(WorkerStats + nameDeb);
            
        } else if 
           (task == 2) {

            }

        sc.close();
    }
}
