/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author umar
 */
public class Task_04_Ex_2 {
    public static void main(String []args){
        //linear search
    int arr[]={1,2,3,4,5};
    int target=5;
    boolean found = false;
 
    for(int i=0; i<arr.length; i++)    
    {
        if(arr[i]==target){
            System.out.println("Element "+target+" found at index "+i);
            found=true ;
        }
    }
    if(found == false){
        System.out.println("Element is not found in the array");
    }
    }
}
