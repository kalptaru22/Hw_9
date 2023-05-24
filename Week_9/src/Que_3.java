import java.util.ArrayList;

public class Que_3 {
    /*
    Write a Java program to create a new array list, add some colours(string) and
    printout the collection using for each loop.
     */
    public static void main(String[]args){
        ArrayList<String> colour = new ArrayList<>();// Declared an array list
        colour.add("Red");
        colour.add("Blue");
        colour.add("White");
        colour.add("Green");
        colour.add("Yellow");

        for (String clr:colour) {

                System.out.println(clr);
        }
    }
}
