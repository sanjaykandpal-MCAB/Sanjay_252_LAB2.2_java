import java.util.Scanner;

public class StringBufferExample {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello World!");

        // Append a string to the StringBuffer
        sb.append(" This is a StringBuffer example.");

        // Insert a string at a specified index
        sb.insert(12, "Java ");

        // Replace a character at a specified index
        sb.replace(0, 5, "Welcome to ");

        // Delete a character at a specified index
        sb.deleteCharAt(24);

        // Get the character at a specified index
        char ch = sb.charAt(10);

        // Set the character at a specified index
        sb.setCharAt(10, '!');

        // Get the length of the StringBuffer
        int length = sb.length();

        // Get the capacity of the StringBuffer
        int capacity = sb.capacity();

        // Ensure that the StringBuffer has enough capacity
        sb.ensureCapacity(50);

        // Convert the StringBuffer to a String
        String str = sb.toString();

        // Get a substring of the StringBuffer
        String substring = sb.substring(10);

        // Get a substring of the StringBuffer with start and end indices
        String substring2 = sb.substring(10, 20);

        // Print the results
        System.out.println("StringBuffer: " + sb);
        System.out.println("Character at index 10: " + ch);
        System.out.println("Length: " + length);
        System.out.println("Capacity: " + capacity);
        System.out.println("String: " + str);
        System.out.println("Substring from index 10: " + substring);
        System.out.println("Substring from index 10 to 20: " + substring2);
    }
}

