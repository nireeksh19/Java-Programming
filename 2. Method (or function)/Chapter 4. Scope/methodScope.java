public class methodScope {
    public static void main(String[] args) {
        //code here no access to x
        
        {     //  block begin

            //code here no access to x
            
            int x = 100;

            // code here has access

            System.out.println(x);

        }     //block ends
        //code here no access
    }
}

// A block of code refers to all of the code between curly braces {}.

// Variables declared inside blocks of code are only accessible by the code between the curly braces, which follows the line in which the variable was declared: