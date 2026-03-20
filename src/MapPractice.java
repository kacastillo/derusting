import java.util.Map;
import java.util.HashMap;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> myMap = new HashMap<>();
    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    myMap.put("kelley", 30);
    myMap.put("kate", 25);
    myMap.put("Charlie", 35);
    // Get the value associated with a given key in the Map
    int valueForBob = myMap.get("kate");
    System.out.println("Value for key 'kate': " + valueForBob);
    // Find the size (number of key/value pairs) of the Map
    int size = myMap.size();
    System.out.println("Size of the map: " + size);

    // Replace the value associated with a given key (the size of the Map should not change)
    myMap.put("kate", 26);

    // Check whether the Map contains a given key
    boolean hasAlice = myMap.containsKey("Alice");
    System.out.println("Map contains key 'Alice': " + hasAlice);

    // Check whether the Map contains a given value
    boolean hasValue30 = myMap.containsValue(30);
    System.out.println("Map contains value 30: " + hasValue30);

    // Iterate over the keys of the Map, printing each key
    for (String key : myMap.keySet()) {
      System.out.println("Key: " + key);
    }

    // Iterate over the values of the map, printing each value
    for (Integer value : myMap.values()) {
      System.out.println("Value: " + value);
    }

    // Iterate over the entries in the map, printing each key and value
    for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
      System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }

    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
