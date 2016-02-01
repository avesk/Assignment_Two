/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package assignment_two;

/**
 *
 * @author averykushner
 */
import java.io.*;
import java.util.Scanner;

public class AnalyzeText {
//private int usaLen=0;
private int i=0;
private String s;
private String[] unsortedAry = new String[27];
private int[] intAry = new int[6];
private double[] dblAry = new double[15];
private char[] chrAry = new char[100];
private String[] strAry = new String[100];
private int intIdx =0, dblIdx=0, chrIdx=0, strIdx=0;


void ReadText(){
    
    
    try(BufferedReader br = new BufferedReader(new FileReader("analyzeMe.txt"))){
        while((s = br.readLine()) != null){
            //usaLen++;
            unsortedAry[i] = s;
            i++;
            
    System.out.println(s);
            
        }
    }catch(IOException exc){
                System.out.println(exc);
                }
    sortArrays();
    
}

void sortArrays(){
    for(String x : unsortedAry){
        try{
         int b = (int) Integer.parseInt(x);
         intAry[intIdx] = b;
         intIdx++;
        }catch(NumberFormatException exc){
            try{
         double a = Double.parseDouble(x);
         dblAry[dblIdx] = a;
         dblIdx++;
         
            }catch(NumberFormatException exc2){
              if(x.length()==1){
                chrAry[chrIdx] =(char) x.charAt(0);
                chrIdx++;
              }
              else strAry[strIdx] = x;
              strIdx++;
            }
        }
            
        }
}


void printArys(){
    System.out.println("Ints:");
    for(int i: intAry){
        
        System.out.print(" " + i);
       // System.out.println();
    } 
    System.out.println();
    System.out.println("doubles:");
     for(double d: dblAry){
       
        System.out.print(" "+ d);
         
    }
     System.out.println("");
     System.out.println("Chars:");
     for(char c: chrAry){
         
         System.out.print(" " + c);
         
    }
     System.out.println("");
     System.out.println("Strings:");
       for(String s: strAry){
         
         System.out.print(" "+ s);
          
    }
       
      
}

}
