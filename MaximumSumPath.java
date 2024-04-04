// Sanket Shivale 04/04/2024
// Find maximum sum path involving elements of given arrays
// Given two sorted arrays of integers, find a maximum sum path involving elements of both arrays whose sum is maximum. 
// We can start from either array, but we can switch between arrays only through its common elements.

// For example,

// Input: X = { 3, 6, 7, 8, 10, 12, 15, 18, 100 }
// Y = { 1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50 }  
// The maximum sum path is: 1 —> 2 —> 3 —> 6 —> 7 —> 9 —> 10 —> 12 —> 15 —> 16 —> 18 —> 100 
// The maximum sum is 199


import java.util.Scanner;

public class MaximumSumPath {
    
    
    public static int maxSumPath(int[] array1, int[] array2) {
        int size1 = array1.length;
        int size2 = array2.length;
        
        int i = 0, j = 0;
        int sum1 = 0, sum2 = 0, result = 0;
        
        
        while (i < size1 && j < size2) {
            if (array1[i] < array2[j]) {
                sum1 += array1[i++];
            } else if (array1[i] > array2[j]) {
                sum2 += array2[j++];
            } else { 
                result += Math.max(sum1, sum2) + array1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }
        
        while (i < size1) {
            sum1 += array1[i++];
        }
        
        while (j < size2) {
            sum2 += array2[j++];
        }
        
        result += Math.max(sum1, sum2);
        
        return result;
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the size of array X:");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter elements of array X:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        
        System.out.println("Enter the size of array Y:");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter elements of array Y:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }
        
        int maxSum = maxSumPath(array1, array2);
        System.out.println("Maximum sum path: " + maxSum);
        
        scanner.close(); 
    }
}


// Output
// Enter the size of array X:
// 9
// Enter elements of array X:
// 3                                      
// 6
// 7
// 8
// 10
// 12
// 15
// 18
// 100
// Enter the size of array Y:
// 13
// Enter elements of array Y:
// 1
// 2
// 3
// 5
// 7
// 9
// 10
// 11
// 15
// 16
// 18
// 25
// 50
// Maximum sum path: 199