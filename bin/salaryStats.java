package Projects.Codworth.bin;

public class salaryStats {
    public String name;
    public int id;
    public double grossSalary, taxSalary;
    

    public int idGen () {
        return id = (int) Math.floor (Math.random() * 9999);
    }
    
    public double liquidSalary() {
        return grossSalary - taxSalary;
    }
    public void increasedSalary(double increasePercetage) {
        grossSalary += (grossSalary - taxSalary)    * increasePercetage / 100;
    }
 
    public String toString() {
        return "Name: " + name
            + " | ID: "
            + idGen()
            + " | Liquid salary $"
            + liquidSalary();
         
    }   
}
