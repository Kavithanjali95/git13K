/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author Kavithanjali.M
 */
public class NewClass1 {
  


   

    public static void main(String[] args) {
        String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
    char[] s=    test.toCharArray();
    
       int count=0;
    for(int i=0;i<s.length;i++){
      if(Character.isDigit(s)){
          
          count++;
      }
    }
    }
}