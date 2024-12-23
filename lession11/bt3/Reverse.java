package lession11.bt3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Reverse Int Array:");
        System.out.println(reverseIntArray());
        System.out.println("Reverse String Array:");
        System.out.println(reverseStringArray());
    }
    private static StringBuilder reverseIntArray(){
        Stack<Integer> stack = new Stack<>();
        int[] arr = {3, 2, 1};
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop().intValue();
        }
        StringBuilder reverseArr = new StringBuilder(Arrays.toString(arr));
        return reverseArr;
    }
    
    private static StringBuilder reverseStringArray(){
        Stack<String> stack = new Stack<>();
        String[] arr = {"Three", "Two", "One"};
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        StringBuilder reverseArr = new StringBuilder(Arrays.toString(arr));
        return reverseArr;
    }
}
