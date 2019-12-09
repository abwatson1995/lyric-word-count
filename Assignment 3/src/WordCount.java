/*
 * Arielle Watson
 * CISC 3130 - Assignment 3
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.HashMap; 
import java.util.Scanner;
public class WordCount { 
 
    public static void main(String[] args) throws FileNotFoundException { 
        //Creating new HashMap
        //Keys are String, Values are Integer 
        HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
        
        //Create new file for output
        //Write to the output file
        File file = new File ("output.txt");        
        PrintWriter output = new PrintWriter("output.txt");
        
        try { 
            // Opening file 
            BufferedReader in = new BufferedReader(new FileReader("TUNlyrics.txt"));
            String str; // string buffer for file reading   
 
            // reading line by line from file    
            while ((str = in.readLine()) != null) { 
                str = str.toLowerCase(); // convert to lower case 
 
                // starting index to copy words from string 
                int index1 = -1;
                
                // process each characters  
                for (int i = 0; i < str.length(); i++) { 
                    // condition if current character is not letter or it is the end of line  
                    if ((!Character.isLetter(str.charAt(i))) || (i + 1 == str.length())) { 
                        // do nothing if previous character was also non-letter 
                        if (i - index1 > 1) { 
                            // copy word from input string buffer to new variable  
                            // from previous non-letter symbol  
                            // to current symbol which is also non-letter 
 
                            // if this is a letter(than it is last character in the line  
                            // and we should copy it to word)   
                            if (Character.isLetter(str.charAt(i))) 
                                i++;
 
                            // copying 
                            String word = str.substring(index1 + 1, i);
 
                            // Check if word is in HashMap 
                            if (wordCount.containsKey(word)) { 
                                // get number of occurrences for this word 
                                // increment it  
                                // and put back again  
                                wordCount.put(word, wordCount.get(word) + 1);
                            } else { 
                                // this is first time we see this word, set value '1' 
                                wordCount.put(word, 1);
                            } 
                        } 
 
                        // remember current position as last non-letter symbol                         
                        index1 = i;
                    } 
                } 
            } 
            // Close buffered reader 
            in.close();
            
        } catch (Exception e) { 
            // If something unexpected happened  
            // print exception information and quit  
            e.getMessage();
        } 
 
        // This code sorts outputs HashMap sorting it by values 
 
        // Get values array 
        ArrayList<Integer> values = new ArrayList<Integer>();
        values.addAll(wordCount.values());
        
        // Sort values array in reverse order
        Collections.sort(values, Collections.reverseOrder());
 
        int last_i = -1;
        // Now, for each value  
        for (Integer i : values) { 
            if (last_i == i) // without duplicates  
                continue;
            last_i = i;
            //print all hash keys  
            for (String s : wordCount.keySet()) { 
                if (wordCount.get(s) == i) // which have this value  
                    output.println(s + " " + i);
            }  
        } 
         output.close();
    } 
} 