import java.util.HashMap;

public class Que_7 {
    /*
    Create a HashMap object called people that will store String keys and Integer
    values: And use for each loop to iterate the value from Map.
     */
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();
        people.put("jublee",1);
        people.put("victoria",2);
        people.put("central",3);
        people.put("northan", 4);
        people.put("elizabeth", 5);

        System.out.println(people);
        for (String m : people.keySet()) {
            System.out.println(m);
        }
        

    }
}
