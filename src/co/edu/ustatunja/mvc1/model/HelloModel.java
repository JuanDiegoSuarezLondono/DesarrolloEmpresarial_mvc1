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
public class HelloModel {
    
    private String regards;
    
    public String sayHello(String name) {
        regards = "Holi "+ name;
        return regards;
    }    
}
