// Sanket Shivale 04/04/2024
// Merge two arrays by satisfying given constraints
// Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells,
//  merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order.

// For example,

// Input: X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 }
// Y[] = { 1, 8, 9, 10, 15 } The vacant cells in X[] is represented by 0 
// Output: X[] = { 1, 2, 3, 5, 6, 8, 9, 10, 15 }

import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        
        int i = m - 1;
        for (int j = m - 1; j >= 0; j--) {
            if (X[j] != 0) {
                X[i--] = X[j];
            }
        }
        
        int k = 0; 
        i = n;
        int j = 0; 
        
        while (i < m && k < n) {
            if (X[i] < Y[k]) {
                X[j++] = X[i++];
            } else {
                X[j++] = Y[k++];
            }
        }
        
        while (k < n) {
            X[j++] = Y[k++];
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array X:");
        int sizeX = scanner.nextInt();
        int[] X = new int[sizeX];
        System.out.println("Enter elements of array X:");
        for (int i = 0; i < sizeX; i++) {
            X[i] = scanner.nextInt();
        }

        System.out.println("Enter the size of array Y:");
        int sizeY = scanner.nextInt();
        int[] Y = new int[sizeY];
        System.out.println("Enter elements of array Y:");
        for (int i = 0; i < sizeY; i++) {
            Y[i] = scanner.nextInt();
        }

        mergeArrays(X, Y);
        System.out.println("Merged array: " + Arrays.toString(X));
        
        scanner.close(); 
    }
}


// shiv@shiv-Inspiron-3501:~/Desktop/New Folder$ cd "/home/shiv/Desktop/New Folder/" && javac MergeArrays.java && java MergeArrays
// Enter the size of array X:
// 9
// Enter elements of array X:
// 0 2 0 3 0 5 6 0 0
// Enter the size of array Y:
// 5
// Enter elements of array Y:
// 1 8 9 10 15
// Merged array: [1, 2, 3, 5, 6, 8, 9, 10, 15]