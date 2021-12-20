//HashMaps stores key-value pairs; Note: keys must be unique
import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args){
        HashMap<String, String> capitals = new HashMap<String,String>();
        capitals.put("Nepal","Kathmandu");
        capitals.put("India","Delhi");
        capitals.put("China","Beijing");
        capitals.put("USA","Washington");
        capitals.put("Germany","Berlin");

        for(String country : capitals.keySet()){  //Here capitals.keySet() gives the keys from hashmap and its value can be accessed using get().
            System.out.println("The capital of "+ country + " is " + capitals.get(country));
        }
        System.out.println();
        HashMap<String,Integer> persons = new HashMap<>();
        persons.put("Saroj",21);
        persons.put("Netesh",22);
        persons.put("Remant",23);
        persons.put("Sagar",21);

        for(String person: persons.keySet()){
            System.out.println("The person's name is "+ person + " and he is "+ persons.get(person) + " years old.");
        }

    }
}

