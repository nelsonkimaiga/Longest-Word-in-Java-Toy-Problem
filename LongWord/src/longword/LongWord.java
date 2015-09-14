/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longword;

/**
 *
 * @author Nelson Kimaiga
 */
//  Using java, have the function LongestWord(sen) take the sen parameter
//  being passed and return the largest word in the string. If there are two or more 
//  words that are the same length, return the first word from the string with that length. Ignore punctuation and assume sen will not be empty. 


import java.util.*; 
import java.io.*;



public class LongWord {
  //String LongestWord(String sen) { 
  
    // code goes here 
public static String LongestWord (String sen){
    
    int maximumLength=0;
    String LargestWord=null;
    if (sen.length() > maximumLength){
        maximumLength=sen.length();
        LargestWord=sen;
    }
      return sen;

}  

} 
  
  public static void main (String[] args) {  
    // the function call should go here    
   
  }   
  
}







  

