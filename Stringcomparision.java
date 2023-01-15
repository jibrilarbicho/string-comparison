/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcomparision;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Stringcomparision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner in=new Scanner(System.in); 
       String response=in.next("you are playing the etnter p or P to quit"); 
       if(!response.equals("p")&&! response.equals("p")){
      System.out.println("you quit the game");    
       } 
       else{
       
     System.out.println("you are playing the game");  
       
    }
    
}
}