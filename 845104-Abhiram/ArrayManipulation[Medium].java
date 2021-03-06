import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

 public static int[] rotateArray(int[] arr, int d){
        // Because the constraints state d < n, we need not concern ourselves with shifting > n units.
        int n = arr.length;
        
        // Create new array for rotated elements:
        int[] rotated = new int[n]; 
        
        // Copy segments of shifted elements to rotated array:
        System.arraycopy(arr, d, rotated, 0, n - d);
        System.arraycopy(arr, 0, rotated, n - d, d);

        return rotated;
 }
  public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] numbers = new int[n];
        
        for(int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }
        
        scanner.close();
        numbers = rotateArray(numbers, d);
                        for(int i : numbers) {
             System.out.print(i + " ");
        }
        System.out.println();
    } 
        
}