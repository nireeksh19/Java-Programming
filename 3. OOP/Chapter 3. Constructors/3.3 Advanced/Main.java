public class Main {
    String fname;
    String lname;
    int age;

    public Main(String firstName, String lastName, int year){
        fname = firstName;
        lname = lastName;
        age = year;
    }
    public static void main(String[] args) {
        Main obj = new Main("Nireeksh", "Shetty",20);
        System.out.println("Hi "+obj.fname+" "+obj.lname+" you are "+obj.age+" years old.");
    }
}