import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> colors = new ArrayList<>();

        // Add elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Get an element
        System.out.println("First color: " + colors.get(0)); // Output: Red

        // Set an element
        colors.set(1, "Yellow");
        System.out.println("Modified colors: " + colors); // Output: [Red, Yellow, Blue]

        // Remove an element
        colors.remove("Red");
        System.out.println("Colors after removal: " + colors); // Output: [Yellow, Blue]

        // Get the size
        System.out.println("Number of colors: " + colors.size()); // Output: 2
    }
}