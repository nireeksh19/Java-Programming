public class Main {
    public static void main(String[] args) {
        // Widening casting
        int myInt = 19;
        double myDouble = myInt; //smaller to bigger automatic type casting
        System.out.println("Widening casting");
        System.out.println(myInt);
        System.out.println(myDouble);

        // Narrowing casting
        double num = 9.09;
        int number = (int) num; //bigger to smaller conversion
        System.out.println("Narrowing casting");
        System.out.println(num);
        System.out.println(number);
    }
}
