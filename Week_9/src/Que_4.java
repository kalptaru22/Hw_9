import java.util.ArrayList;

public class Que_4 {
    /*
    Write a Java program to iterate through all elements in an array list using
    Iterator.
     */
    public static void main(String[] args) {

        ArrayList<String> colour = new ArrayList<>();// Declared an array list
        colour.add("Red");
        colour.add("Blue");
        colour.add("White");
        colour.add("Green");

        for (int i = 0; i < colour.size(); i++) {
            System.out.print(colour.get(i));
            System.out.print(", ");
        }
    }

}

