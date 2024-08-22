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
public class NewClass {
     public static void main(String args[]){
    
NewClass j= new NewClass();
//int d=j.mutliply(2, 2,2);
int d=j.mutliply(3, 3,3);
System.out.println(d);
        
        
 }
  
  
          

    public int mutliply(int a,int b,int c){
    int d=a+b+c;
    return d/3;
        
    }
}

