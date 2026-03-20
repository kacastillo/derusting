public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] myArray = new String[4];
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    myArray[0] = "Hello";
    myArray[1] = "World";
    myArray[2] = "Java";
    myArray[3] = "Programming";

    // Get the value of the array at index 2
    String itemAtIndex2 = myArray[2];
    System.out.println("Item at index 2: " + itemAtIndex2);

    // Get the length of the array
    int length = myArray.length;
    System.out.println("Length of the array: " + length);
    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < length; i++) {
      System.out.println("Index " + i + ": " + myArray[i]);
    }

    // Iterate over the array using a for-each loop and print out each item
    for (String item : myArray) {
      System.out.println(item);
    }

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
