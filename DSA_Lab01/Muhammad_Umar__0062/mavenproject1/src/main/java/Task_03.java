/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author umar
 */
public class Task_03 {
    public static void main(String []args){
        //Deletion in an Array
        int[] arr = new int[5];
        arr[0]=8;
        arr[1]=16;
        arr[2]=24;
        arr[3]=32;
        arr[4]=40;
        System.out.print("Elements before deleting:");
        for(int i=0; i<arr.length; i++){
            System.out.println(i+" "+arr[i]);
        }
        System.out.print("\n Elements after deletion");
        for(int i=2; i<arr.length-1; i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
        for(int i=0; i<arr.length; i++){
            System.out.println(i+" "+arr[i]);
        }
    }
}
