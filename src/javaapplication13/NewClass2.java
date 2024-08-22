/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author Kavithanjali.M
 */
public class NewClass2 {
    public static void main(String[] args) {
           String s="Kavitha*&&1234";
       char[] ch = s.toCharArray();
      int cha=0;
      int digits=0;
      int letter = 0;
      int spr= 0;
      
      for(int i=0;i<ch.length;i++){
          
          if(Character.isDigit(ch[i])){
              digits++;
              
          }
          if(Character.isAlphabetic(ch[i])){
              cha++;
              
          }
              
      }
      
   System.out.println("cha:"+cha); 
       System.out.println(digits);  
    }
}
      
      
      
