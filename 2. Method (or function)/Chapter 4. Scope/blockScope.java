// In Java, variables are only accessible inside the region they are created. This is called scope.

public class blockScope {
    public static void main(String[] args) {
        //code here cannot access x
        
        int x = 19;

        //code here have access to x

        System.out.println("the value of x: "+x);
    }
}

// Variables declared directly inside a method are available anywhere in the method following the line of code in which they were declared: