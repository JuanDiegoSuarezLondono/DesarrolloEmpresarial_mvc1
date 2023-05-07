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
public class PalindromoModel {
    private String confirmacion;
    
    public String confirmarPalindromo(String name) {
        confirmacion = "Si";
        for(int i=0; i<name.length();i++) {
            if(name.charAt(i) != name.charAt(name.length()-1-i)){
                confirmacion = "No";
            }
        }
        return confirmacion;
    }
}
