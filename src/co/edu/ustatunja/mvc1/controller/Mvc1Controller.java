/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ustatunja.mvc1.controller;

import co.edu.ustatunja.mvc1.model.Fibonacci;
import co.edu.ustatunja.mvc1.model.HelloModel;
import co.edu.ustatunja.mvc1.model.PalindromoModel;
import co.edu.ustatunja.mvc1.model.ParImpar;
import co.edu.ustatunja.mvc1.view.WindowsView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author suare
 */
public class Mvc1Controller {
    private WindowsView theView;
    private HelloModel theHelloModel;
    private Fibonacci theFibonacciModel;
    private PalindromoModel thePalindromoModel;
    private ParImpar theParImparModel;

    public Mvc1Controller(WindowsView view, HelloModel helloModel, Fibonacci fibonacciModel, PalindromoModel palindromoModel, ParImpar parImparModel) {
        theView = view;
        theHelloModel = helloModel;
        theFibonacciModel = fibonacciModel;
        thePalindromoModel = palindromoModel;
        theParImparModel = parImparModel;
        
        theView.addBtnListener(new btnListener());
    }    

    
    class btnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Click Me to Hello!")) {
                theView.setText(theHelloModel.sayHello(theView.getText()));
            }
            else if (e.getActionCommand().equals("Serie Fibo")) {
                theView.setIntVector(theFibonacciModel.getFibonacci(theView.getNumber()));
            }       
            else if (e.getActionCommand().equals("Palindromis")) {
                theView.setText(thePalindromoModel.confirmarPalindromo(theView.getText()));
            }  
            else if (e.getActionCommand().equals("¿Impar o par?")) {
                try {
                if(theParImparModel.esPar(theView.getNumber()) == false) {
                    theView.setText(theHelloModel.sayHello(theView.getText()));
                }
                else if (theParImparModel.esPar(theView.getNumber()) == true) {
                    theView.setIntVector(theFibonacciModel.getFibonacci(theView.getNumber()));
                }   
                }
                catch(Exception error){
                    theView.setText("Pongase serio socio");
                }
            } 
        }
    }
}
