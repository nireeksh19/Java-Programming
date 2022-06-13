public class Main {
    public static void main(String[] args) {

        // String and String Methods

        String txt = "Hello Coders!!";
        System.out.println(txt.toLowerCase());
        System.out.println(txt.toUpperCase());
        System.out.println("Length of the string is :"+txt.length());
        System.out.print("e is present at index :");
        System.out.println(txt.indexOf('e'));

        // Concatenation

        String firstName = "Nireeksh";
        String lastName = "Shetty";
        System.out.println(firstName+" "+lastName); //Nireeksh Shetty
        // System.out.println(firstName.concat(lastName)); //output : NireekshShetty

        // Note :If you add a number and a string, the result will be a string concatenation
        int x = 10;
        String y = "89";
        System.out.println(x+y); //1089

        // Special Characters
        System.out.println("Hii I am \"Nireeksh\""); // Hi I am "Nireeksh" 
        System.out.println("It\'s alright."); // "It's alright."
        System.out.println("The character \\ is called backslash."); // The character \ is called backslash.
    }
}
