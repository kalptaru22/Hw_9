import java.util.ArrayList;

public class Que_5 {
    /*
    Write a Java program to test an array list is empty or not. Define array list with
    underground tube names
     */
    public static void main(String[] args) {
        ArrayList<String> tube = new ArrayList<>();//Declared an array list
        tube.add("Central line");
        tube.add("Victoria line");
        tube.add("northan line");
        tube.add("Jublee line");
        tube.add("Hammersmith line");
        System.out.println("Array list is empty: " + tube.isEmpty());
        tube.removeAll(tube);
        System.out.println("After removing all elements, Array list is empty : "+ tube.isEmpty());
    }
}
