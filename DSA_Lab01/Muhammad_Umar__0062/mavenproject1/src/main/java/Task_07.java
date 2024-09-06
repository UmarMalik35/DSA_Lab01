
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author umar
 */
public class Task_07 {
    public static void main(String []args){
  String str1 = "abc";
  String str2 = "bca";
  
}
public static boolean isAnagram(String str1, String str2){
    boolean value = false;
    char[] arr1= str1.toCharArray();
    char[] arr2= str2.toCharArray();
    
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    if(Arrays.equals(arr1, arr2)){
        System.out.println("It is Anagram");
        value = true;
    }
    return value;
}
}
