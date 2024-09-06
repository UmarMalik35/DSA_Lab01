/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author umar
 */
public class Task_02 {
    public static void main(String []args){
        //Exercise 1
        System.out.print("Exercise 1:");
        int[] list=new int[6];
        list[0]=12;
        list[1]=24;
        list[2]=36;
        list[3]=48;
        list[4]=60;
        int element = 6;
        for(int i=list.length-1; i>0; i--){
            list[i]=list[i-1];
        }
        list[0] = element;
        for(int i=0; i<list.length; i++){
            System.out.print(list[i]+" ");
        }
        
        //Exercise 2
        list[0]=100;
        list[1]=200;
        list[2]=300;
        list[3]=400;
        list[4]=500;
        System.out.print("\nExercise 2: "); 
      int  element1=250;
        int pos=2;
        for(int i=list.length-1; i>pos; i--){
            list[i]=list[i-1];
        }
        list[pos]=element1;
        for(int i=0; i<list.length; i++){
            System.out.print(list[i]+" ");
        }
        
        //Exercise 3
        System.out.print("\nExercise 3");
        list[0]=3;
        list[1]=6;
        list[2]=9;
        list[3]=12;
        list[4]=15;
        list[list.length-1]=18;
        int value = 18;
        for (int i=list.length-1; i<2; i--){
            list[i]=list[i-1];
        }
        list[2]=value;
        for(int i=0; i<list.length; i++){
            System.out.print(list[i]+" ");
        }
        
       
    }
}
