package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Easy {

    /**
     * Sorting a List
     * Write a method that accepts a list of strings and sorts them in alphabetical order using a lambda expression.
     * Input: ["banana", "apple", "cherry", "date"]
     * Output: ["apple", "banana", "cherry", "date"]
     */

    //Without Lambda
    public void sortingAList() {
        List<String> result = new ArrayList<>(Arrays.asList("banana", "apple", "cherry", "date"));

        Collections.sort(result);

        System.out.println(result);

    }

    // With Lambda
    public void sortingAListWithLambda() {
        List<String> result = new ArrayList<>(Arrays.asList("banana", "apple", "cherry", "date"));

        result.sort((str1, str2) -> str1.compareTo(str2));

        System.out.println(result);

    }

    // With Method reference
    public void sortingAListWithReference() {
        List<String> result = new ArrayList<>(Arrays.asList("banana", "apple", "cherry", "date"));

        result.sort(String::compareTo);

        System.out.println(result);

    }

}
