/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ustatunja.mvc1.model;

/**
 *
 * @author suare
 */
public class Fibonacci {
    
    private int[] fibonacci;
    
    public int[] getFibonacci (int longVector) {
        fibonacci = new int[longVector];
        for (int i = 0; i < longVector; i++) {
            fibonacci[i] = fibo(i);
        }
        return fibonacci;
    }
    
    public int fibo(int n) {
        if (n>1){
           return fibo(n-1) + fibo(n-2); 
        }
        else if (n==1) {
            return 1;
        }
        else if (n==0){
            return 0;
        }
        else{
            return -1; 
        }
    }   
}
