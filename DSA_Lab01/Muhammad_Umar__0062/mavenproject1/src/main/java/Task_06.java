/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author umar
 */
import java.util.Scanner;
public class Task_06 {
 
    public static boolean isPalindrome(String str){
        String reversed = new StringBuilder(str.toLowerCase()).reverse().toString();
        return str.toLowerCase().equals(reversed);
        
    }
    public static void main(String args[]){
        String input= "Radar";
        boolean result = isPalindrome(input);
        
        if(result){
            System.out.println("a palindrome");
        }else{
            System.out.println(" not a palindrome ");
        }
    }
    
}