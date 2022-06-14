public class Main {

    int x = 7;
    public static void main(String[] args) {
        Main myObj1 = new Main();
        Main myObj2 = new Main();
        myObj2.x = 25;  //doesn't effect value of attribute x in object 1
        System.out.println("Object 1 : "+myObj1.x); //7
        System.out.println("Object 2 : "+myObj2.x); //25
    }
}
