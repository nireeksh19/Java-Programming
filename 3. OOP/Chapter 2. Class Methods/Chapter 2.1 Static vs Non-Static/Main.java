public class Main {
    //static method
    static void staticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }
    //non static or public
    public void publicMethod(){
        System.out.println("Public methods cannot be called without creating objects");
    }

    //Main method
    public static void main(String[] args) {
        System.out.println("calling static method directly!!");

        staticMethod();
        // myPublicMethod(); This would compile an error
        Main myObj = new Main();

        System.out.println("calling public method after creating object!!");
        
        myObj.publicMethod();
    }
}
