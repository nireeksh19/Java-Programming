// Import the LinkedList class
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars); //[Volvo, BMW, Ford, Mazda]

    // Use addFirst() to add the item to the beginning
    cars.addFirst("Audi");
    System.out.println(cars); //[Audi, Volvo, BMW, Ford, Mazda]

    // Use addLast() to add the item to the end
    cars.addLast("skoda");
    System.out.println(cars); //[Audi, Volvo, BMW, Ford, Mazda, skoda]

    // Use getFirst() to display the first item in the list
    System.out.println(cars.getFirst()); //Audi

    // Use getLast() to display the last item in the list
    System.out.println(cars.getLast()); //skoda

    // Use removeFirst() remove the first item from the list
    cars.removeFirst();
    System.out.println(cars); //[Volvo, BMW, Ford, Mazda, skoda]

    // Use removeLast() remove the last item from the list
    cars.removeLast();
    System.out.println(cars); //[Volvo, BMW, Ford, Mazda]
  }
}
