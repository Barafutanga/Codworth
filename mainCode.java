package Projects.Codworth;
import java.util.Scanner;

public class mainCode {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //credits
        int coderId = 2021221639;
        String coder = "Antônio Otaviano";
        
        //introduction
        System.out.printf("CODWORTH, MADE BY PIMBA ENTERPRISE\nMain Programmer: %s [ID: %d]\nPDF Presentation: %s\nPDF Manual: %s\nVideo recording: %s\nVideo editor: %s\nScreen writer: %s\n",
        coder, coderId, coder, coder, coder, coder, coder);
        System.out.println("---------------------------");
        
        System.out.println("WELCOME TO CODWORTH, HERE YOU CAN MANAGE EMPLOYEE'S DATA\nFIRST, WE NEED HIRE SOMEONE!");
        System.out.printf("1- Hire\n2- Edit\n3- Fire\n4- Off\n(digit a number): ");
        
        int operation = sc.nextInt();
        int maxEmp = 20;
        //1
        int hires = 0;
        //2
        int verif = 0;
        
        System.out.println("---------------------------");
        
        //employees variables
        String[] name = new String[maxEmp];
        int   [] id   = new int[maxEmp];
        double[] grossSalary = new double[maxEmp];
        double[] tax  = new double[maxEmp];
        double[] liquidSalary = new double[maxEmp];
        
        
        //hiring
        if (operation == 1) {
            
            System.out.println("HOW MANY PEOPLE YOU WILL ADD?");
            hires = sc.nextInt();
            
            //name
            System.out.println("EMPLOYEES NAME");
            for (int n = 0; n < hires; n++) { 
                name[n] = sc.nextLine();
                if (n < 1) {
                    name[n] = sc.nextLine();
                }
            }
            //id
            for (int i = 0; i < hires; i++) {
                id[i] = (int) Math.floor (Math.random() * 9999);
            }
            //gross salary
            System.out.println("EMPLOYEES GROSS SALARY");
            for (int g = 0; g < hires; g++) {
                grossSalary[g] = sc.nextDouble();
            }
            //tax salary
            System.out.println("EMPLOYEES TAX (DO NOT USE %)");
            for (int t = 0; t < hires; t++) {
                tax[t] = sc.nextDouble();
            }
            //liquid salary
            for (int s = 0; s < hires; s++) {
                liquidSalary[s] = grossSalary[s] - ((grossSalary[s] * tax[s]) /100);
            }
            
            //status
            System.out.println("EMPLOYEE STATUS");
            for (int a = 0; a < hires; a++) {
                System.out.printf("NAME: %s | ID: %d | LIQUID SALARY: R$%.2f | GROSS SALARY: R$%.2f | TAX: %.2f\n", name[a], id[a], liquidSalary[a], grossSalary[a], tax[a]);                                
            }
            System.out.println("---------------------------");
            
            //next step
            System.out.print("WHAT IS THE NEXT STEP?\n2- Edit\n3- Fire\n(digit a number): ");
            operation = sc.nextInt();
            
            System.out.println("---------------------------");
        } 
        
        
        //editing
        if (operation == 2 && hires != 0) {
            
            //register input data
            verif++;
            
            //call function
            System.out.print("INSERT ID: ");
            int idGrab = sc.nextInt();
            System.out.println();
            
            
            for (int j = 0; j < hires; j++) {
                int editStatus = 0;
                int verifier = 0;
                
                if (id[j] == idGrab) {
                    System.out.println("CORRESPONDING VALUES: ");
                    System.out.println("1- " + name[j]);
                    System.out.println("2- " + id[j] + "[CAN NOT BE CHANGED]");
                    System.out.println("3- " + grossSalary[j]);
                    System.out.println("4- " + tax[j]);
                    System.out.print("WICH ONE YOU WANT TO CHANGE?\n(digit a number): ");
                    editStatus =  sc.nextInt();
                    verifier++;
                    
                    if (verifier == 1) {
                        if (editStatus == 1) {
                            System.out.printf("NEW NAME: ");
                            name[j] = sc.nextLine();
                        } else if (editStatus == 3) {
                            System.out.printf("NEW GROSS SALARY: ");
                            grossSalary[j] = sc.nextDouble();
                        } else if (editStatus == 4) {
                            System.out.printf("NEW TAX: ");
                            tax[j] = sc.nextDouble();
                        }
                    }                             
                }
                if(verif == 1) {
                    System.out.println("ID DOES NOT CORRESPOND TO DATA SERVER!");   
                }
                //next step
                System.out.print("WHAT IS THE NEXT STEP?\n3- Fire\n(digit a number): ");
                operation = sc.nextInt();
                
                System.out.println("---------------------------");
            } 
            
            
            //firing
            if (operation == 3 && hires != 0) {
                System.out.println("INSERT EMPLOYEE'S ID YOU WANT TO DELETE");
                System.out.printf("ID: ");
                idGrab = sc.nextInt();
                
                for (int k = 0; k < hires; k++) {
                    if (idGrab == id[k]) {
                        name[k] = null;
                        id[k] = 0;
                        grossSalary[k] = 0.0;
                        tax[k] = 0.0;
                        hires--;
                    }
                }
                System.out.printf("UPDATED DATA\nEMPLOYEES= %d\n", hires );                        
            }     
            
            
            for (int m = 0; m < hires + 1; m++) {
                if (id[m] == 0) {
                    m++;
                }
                if (id[m] != 0) {
                    System.out.printf("NAME: %s | ID: %d | LIQUID SALARY: R$%.2f |GROSSSALARY: R$%.2f | TAX: %.2f\n", name[m], id[m], liquidSalary[m], grossSalary[m], tax[m]);
                }
            }
            sc.close();  
        }
    }
}