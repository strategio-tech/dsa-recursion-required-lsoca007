package tech.strategio;

import java.util.*;

public class E01 {
    public int getNthFib(int n) {

        // if n is less than or equal to 0, return 0
        if (n <= 0) {
            return 0;
        }
        // create an ArrayList to store the Fibonacci sequence
        ArrayList<Integer> fib = new ArrayList<Integer>();
        // add the first Fibonacci number to the list
        fib.add(0);
        // if n is greater than 1, add the second Fibonacci number to the list and calculate the remaining numbers
        if (n > 1) {
            fib.add(1);
            // loop through the remaining elements of the list, starting from the 3rd element
            for (int i = 2; i < n; i++) {
                // add the sum of the previous two elements to the current element
                fib.add(fib.get(i-1) + fib.get(i-2));
            }
        }
        // return the last element of the list, which is the nth Fibonacci number
        return fib.get(n-1);
    }
}