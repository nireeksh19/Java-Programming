import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int age;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your age :");
        age = obj.nextInt();
        if (age >18) {
            System.out.println("Eligible for voting!");
        }
        else if(age > 10){
            System.out.println("You are now children");
        }
        else{
            System.out.println("You are child");
        }
        
        // Short hand if-else 
        String str = (age>18)?"Aged":"Young";
        System.out.println("You are "+str);
    }
}