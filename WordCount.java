// Sanket Shivale 04/04/2024
// Write a Java Program to count the number of words in a string using HashMap.

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
 
class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        scanner.close();

        Map<String, Integer> hashMap = new HashMap<>();
 
        String[] words = str.split(" ");
 
        for (String word : words) {
            Integer count = hashMap.get(word);
            if (count == null)
                hashMap.put(word, 1);
            else
                hashMap.put(word, count + 1);
        }
        
        System.out.println(hashMap);
    }
}


// shiv@shiv-Inspiron-3501:~/Desktop/New Folder$ cd "/home/shiv/Desktop/New Folder/" && javac WordCount.java && java WordCount
// Enter a string:
// The String to count word in the string so we can get word count
// {The=1, the=1, can=1, string=1, in=1, get=1, count=2, String=1, to=1, so=1, word=2, we=1}