public class Main {
    static int sum(int x,int y){
        return x+y;
    }
    static double sum(double x,double y){
        return x+y;
    }
    public static void main(String[] args) {
       int a = sum(4, 7);
        double b = sum(2.5, 4.1);
        System.out.println("int sum: "+a);
        System.out.println("double sum: "+b);
    }
}
// Output :
// int sum: 11
// double sum: 6.6