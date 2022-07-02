import java.util.ArrayList;
import java.util.Collections;

public class Program1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        // [1, 2, 3, 4, 5]

        System.out.println(list.get(2)); //3

        list.set(2, 24);
        System.out.println(list);
        //[1, 2, 24, 4, 5]

        list.remove(2);
        System.out.println(list);
        //[1, 2, 4, 5]

        System.out.println(list.size()); //4

        list.add(0);
        System.out.println(list);
       // [1, 2, 4, 5, 0]

        Collections.sort(list);
        System.out.println(list);
       // [0, 1, 2, 4, 5]

       list.clear();
       System.out.println(list);
       //[]
    }
}
