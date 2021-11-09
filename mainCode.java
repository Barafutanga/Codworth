package Projects.Codworth;
import java.util.Scanner;

public class mainCode {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("WELCOME TO CODWORTH, HERE YOU CAN MANAGE EMPLOYEE'S DATA\nWHAT YOU WANT TO DO?");
        System.out.printf("1- Hire\n2- Edit\n3- Fire\n(digit a number): ");
        
        int operation = sc.nextInt();
        int maxEmp = 20;
        //1
        int hires = 0;
        
        System.out.println("---------------------------");
        
        //employees variables
        String[] name = new String[maxEmp];
        int   [] id   = new int[maxEmp];
        double[] grossSalary = new double[maxEmp];
        double[] tax  = new double[maxEmp];
        
        
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
            System.out.println("EMPLOYEES TAX");
            for (int t = 0; t < hires; t++) {
                tax[t] = sc.nextDouble();
            }
            
            //status
            System.out.println("EMPLOYEE STATUS");
            for (int a = 0; a < hires; a++) {
                System.out.printf("NAME: %s | ID: %d | GROSS SALARY: %.2f | TAX: %.2f\n", name[a], id[a], grossSalary[a], tax[a]);                                
            }
            System.out.println("---------------------------");
            
            //next step
            System.out.print("WHAT IS THE NEXT STEP?\n2- Edit\n3- Fire\n(digit a number): ");
            operation = sc.nextInt();
            
            System.out.println("---------------------------");
        } 
        
        
        //editing
        if (operation == 2 && hires != 0) {
            
            //call function
            System.out.print("INSERT ID: ");
            int idGrab = sc.nextInt();
            System.out.println();
            
            System.out.println("CORRESPONDING VALUES: ");
            for (int j = 0; j < hires; j++) {
                int editStatus = 0;
                int verifier = 0;
                
                if (id[j] == idGrab) {
                    System.out.println("1- " + name[j]);
                    System.out.println("2- " + id[j] + "[CAN'T BE CHANGED]");
                    System.out.println("3- " + grossSalary[j]);
                    System.out.println("4- " + tax[j]);
                    System.out.print("WICH ONE YOU WANT TO CHANGE?\n(digit a number): ");
                    editStatus =  sc.nextInt();
                    verifier++;
                } else {
                    System.out.println("ID DOES NOT CORRESPOND TO SERVER DATA");
                }
                
                if (verifier == 1) {
                    if (editStatus == 1) {
                        name[j] = sc.nextLine();
                    } else if (editStatus == 3) {
                        grossSalary[j] = sc.nextDouble();
                    } else if (editStatus == 4) {
                        tax[j] = sc.nextDouble();
                    }
                }                
            }
        }


        //firing
        if (operation == 3 && hires != 0) {
            System.out.println("INSERT EMPLOYEE'S ID YOU WANT TO DELETE");
            int idGrab = sc.nextInt();

            for (int k = 0; k < hires; k++) {
                if (idGrab == id[k]) {
                    
                }
            }
        }
        
        sc.close();
    }    
}
