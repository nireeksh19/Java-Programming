public class Main{   //Class named Main
    int x = 10;        // variable x / attribute 
    public static void main(String[] args) {
        Main myObj1 = new Main();      //object myObj is created
        System.out.println(myObj1.x); //10
        myObj1.x = 15;//over riding
        System.out.println(myObj1.x); // 15
    }
}