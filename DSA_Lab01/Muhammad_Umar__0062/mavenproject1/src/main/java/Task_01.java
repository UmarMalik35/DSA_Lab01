/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author umar
 */
public class Task_01 {
    public static void main(String []bhalay){
     
        //Exercise 1
        int[] list=new int[6];
        list[0]=5;
        list[1]=15;
        list[2]=25;
        list[3]=35;
        list[4]=45;
        list[5]=55;
        System.out.println("Exercise 1:");
        for(int i=0; i<list.length; i++){
            System.out.print(list[i]+" ");
        }
                //Exercise 2
        System.out.println("\nExercise 2:");
        for(int i=0; i<list.length; i++){
            System.out.println("Element at index: "+i+":"+list[i]);
        }
    }
}
