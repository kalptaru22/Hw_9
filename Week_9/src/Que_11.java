import java.util.ArrayList;

public class Que_11 {
    /*
    Declare global variables of your name, Add all your group names in list, using
    for each loop iterate and print ONLY your name.
     */
    static String name= "Maulik";

    public static void main(String[] args) {
        ArrayList<String> postman = new ArrayList<>();//Declared an array list
        postman.add("Falguni");//index 0
        postman.add("Jignesh");// index 1
        postman.add("punam");// index 2
        postman.add("Mahesh");//index 3
        postman.add("Hemi");// index 4
        postman.add("Maulik");// index 5

        for (String x:postman) {
            if (postman.contains(name)){
                System.out.println(name);
                break;
            }

        }



    }
}