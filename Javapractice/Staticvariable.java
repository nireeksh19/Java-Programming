class Emp{
    public static double salary;
    public static String name ="Nireeksh"; 
}
public class Staticvariable {
    public static void main(String[] args) {
        Emp.salary=10000;
        System.out.println(Emp.name+"'s salary is : "+ Emp.salary);
        
    }
    
}
