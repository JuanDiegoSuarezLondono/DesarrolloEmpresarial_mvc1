/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ustatunja.mvc1.view;

import co.edu.ustatunja.mvc1.controller.Mvc1Controller;
import co.edu.ustatunja.mvc1.model.*;

/**
 *
 * @author suare
 */
public class mvc {
        public static void main(String[] args) {
        WindowsView myWindow = new WindowsView("Puro sabor latino pape");
        
        HelloModel myModel = new HelloModel();
        
        Fibonacci myFibonacci = new Fibonacci();
        
        PalindromoModel myPalindromo = new PalindromoModel();
        
        ParImpar myParImpar = new ParImpar();
        
        Mvc1Controller myController = new Mvc1Controller(myWindow, myModel, myFibonacci, myPalindromo, myParImpar);
        
        myWindow.setVisible(true);
    }    
}
