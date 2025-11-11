import java.util.ArrayList;
import java.util.Iterator;

public class RemoveOddElements {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> f = new ArrayList<>();

        // Add some numbers to the list
        for (int i = 1; i <= 10; i++) {
            f.add(i);
        }

        System.out.println("Original List: " + f);

        // Create an iterator to traverse the list
        Iterator<Integer> itr = f.iterator();

        // Traverse and remove odd elements
        while (itr.hasNext()) {
            int num = itr.next();
            if (num % 2 != 0) {  // Check if number is odd
                itr.remove();   // Remove odd numbers using iterator
            }
        }

        System.out.println("List after removing odd elements: " + f);
    }
}