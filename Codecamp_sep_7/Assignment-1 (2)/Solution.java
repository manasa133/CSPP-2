import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.ArrayList;

/**
 * Class for set.
 * @author :
 */
class Set {
    //your code goes here...
    //Good luck :-)
    private int[] arr;
    Set set = new Set();
    private int size;
    // Set set = new Set(Arrays.asList(arr));
    /**.
     * Constructs the object.
     */
    public Set(int[] set) {
        this.set = new int[set.length];
        for (int i = 0; i < set.length; i++) {
            this.set[i] = set[i];
        }
        size = 0;
    }

    // private Set() {
    //  int ten = 10;
    //  set = new Set[ten];
    //     size = 0;
    // }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public int size() {
        return size;
    }
    /**.
     * { function_description }
     *
     * @param      element  The element
     *
     * @return     { description_of_the_return_value }
     */
    public boolean contains(final int element) {
        for (int i : set) {
            if (set == set[i]) {
                return true;
            }
        }
        return false;
    }
    /**.
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        // Replace the code below
        if (size == 0) {
            return "{}";
        } else {
            String str = "{";
            int i = 0;
            for (i = 0; i < size - 1; i++) {
                str = str + set[i] + ",";
            }
            str = str + set[i] + "}";
            return str;
        }
    }
    /**.
     * { function_description }
     *
     * @param      element  The element
     */
    public void add(final int element) {
        if (size < set.length) {
            set[size++] = element;
        } else {
            resize(element);
        }
    }
    /**.
     * { function_description }
     *
     * @param      element  The element
     */
    public void resize(final int element) {
        set = Arrays.copyOf(set, 2 * size);
        set[size++] = element;
    }

    public void addAll(final int[] set) {
        for (int i = 0; i < set.length; i++) {
            add(set[i]);
        }
    }
    public Set intersection(final Set set) {
        //   Set intersect = new TreeSet();
        // intersect.retainAll();
        int members = 0;
        for (int i = 0; i < size; i++) {
            if (this.set.contains(set[i]))
                members++;
        }
        int[] newMembers = new int[members];
        int flag = 0;
        for (int i = 0; i < set.length; i++) {
            if (this.set.contains(set[i]))
                newMembers[flag++] = set[i];
        }
        return new Set(newMembers);
    }

    public Set retailall(int[] set){
        Set new1 = new TreeSet();
        new1.retainAll();
    }
}
/**.
 * Solution class for code-eval.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * helper function to convert string input to int array.
     *
     * @param      s     { string input from test case file }
     *
     * @return     { int array from the given string }
     */
    public static int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
               .mapToInt(Integer::parseInt)
               .toArray();
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        Set s = new Set();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
            case "size":
                System.out.println(s.size());
                break;
            case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
            case "print":
                System.out.println(s);
                break;
            case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    s.add(intArray);
                }
                break;
            case "intersection":
                s = new Set();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
            case "retainAll":
                s = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
            case "cartesianProduct":
                s = new Set();
                t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;
            default:
                break;
            }
        }
    }
}
