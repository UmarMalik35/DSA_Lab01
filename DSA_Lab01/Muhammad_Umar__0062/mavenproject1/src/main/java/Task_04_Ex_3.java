
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author umar
 */
public class Task_04_Ex_3 {
    public static void main(String []ars){
        //binary search
        int arr[]={11,22,33,44,55};
        int target = 33;
        Arrays.sort(arr);
        int left =0;
        int right = arr.length-1;
        int middle;
        boolean found = false;
        while (left <= right ){
            middle = left + (right - left)/2;
            if(arr[middle]==target){
                System.out.println("Element "+target+" Found at index "+middle);
                found = true;
            break;
            }
            if(arr[middle]<target){
                left = middle +1;
            }
            else{
                right = middle -1;
            }
        }
        if(found == false){
            System.out.println("Element "+target+" is not found in this array");
        }
    }
}
