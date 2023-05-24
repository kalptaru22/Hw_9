import java.util.ArrayList;

public class Que_10 {
    /*
    Write program and add all group members names in to array and iterates
    through for each loop and print your name.
     */

    public static void main(String[] args) {
        ArrayList<String> postman = new ArrayList<>();//Declared an array list
        postman.add("Maulik");// index 0

        postman.add("Falguni");//index 1

        postman.add("Jignesh");
        postman.add("punam");
        postman.add("Mahesh");
        postman.add("Hemi");
        //System.out.println(postman.get(0));
        String m = postman.get(0);
        for (String pm:postman) {
            System.out.println("My name is :"+ m);
            break;

        }
    }
}

