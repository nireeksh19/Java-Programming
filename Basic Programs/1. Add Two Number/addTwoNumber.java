import java.util.Scanner; // Import the Scanner class

public class addTwoNumber {
    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner obj = new Scanner(System.in); //Create a Scanner object
        System.out.println("Enter Number 1:");
        num1 = obj.nextInt();
        System.out.println("Enter Number 2:");
        num2 = obj.nextInt();
        sum = num1 + num2;
        System.out.println("The sum is : "+sum);
    }
}
