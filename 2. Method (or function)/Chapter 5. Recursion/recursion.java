public class recursion {

    public static void main(String[] args) {
        // find sum between 5 and 10
        int a = sum(5, 10);
        System.out.println("Sum is: " + a);
    }

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}
