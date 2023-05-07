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
public class ParImpar {
    private boolean confirmacion;
    public boolean esPar(int numero) {
        confirmacion = false;
        if(numero %2 != 0)  {
            confirmacion = true;
        }         
        return confirmacion;
    }    
}
