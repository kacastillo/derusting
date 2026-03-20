import java.util.List;
import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String s = "Java practice";

    // Find the length of the string
    int length = s.length();

    // Concatenate (add) two strings together and reassign the result
    s = s + "but I still need more practice";
    System.out.println(s);
    // Find the value of the character at index 3
    char c = s.charAt(3);
    System.out.println(c);

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    boolean contains = s.contains("abc");
    System.out.println(contains);

    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < s.length(); i++) {
      System.out.println(s.charAt(i));
    }


    // Create an ArrayList of Strings and assign it to a variable
    List<String> stringList = new ArrayList<>();


    // Add multiple strings to the List (OK to do one-by-one)
    stringList.add("Hello");
    stringList.add("World");
    stringList.add("Java");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String joinedStrings = String.join(", ", stringList);
    System.out.println(joinedStrings);

    // Check whether two strings are equal
    String str1 = "Hello";
    String str2 = "Hello";
    boolean areEqual = str1.equals(str2);
    System.out.println(areEqual);

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
