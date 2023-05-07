/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ustatunja.mvc1.view;

import java.awt.event.ActionListener;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Estudiante
 */
public class WindowsView extends JFrame{
 
    private JButton btnHello;
    private JButton btnFibonacci;
    private JButton btnBuscaMinas;
    private JButton btnPalindromo;
    private JButton btnParImpar;
    private JLabel lblTexto;
    private JTextField txtField;
    private JPanel pnlArriba;
    private JPanel pnlAbajo;
    
    public WindowsView(String title){
        setTitle(title);
        initComponents();
        shownWindowView();
        setLayout(new GridLayout(3,1));
        setLocationRelativeTo(null);
    }
    
    public void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         
        
        pnlAbajo = new JPanel();
        pnlArriba = new JPanel();
        btnHello = new JButton("Click Me to Hello!");
        btnFibonacci = new JButton("Serie Fibo");
        btnBuscaMinas = new JButton("Busca Minas Bien perron");
        btnPalindromo = new JButton("Palindromis");
        btnParImpar = new JButton("¿Impar o par?");
        lblTexto = new JLabel();
        txtField = new JTextField(35);   
        
        
        pnlArriba.add(txtField); 
        pnlAbajo.add(btnHello);
        pnlAbajo.add(btnFibonacci);
        pnlAbajo.add(btnBuscaMinas);
        pnlAbajo.add(btnPalindromo);
        pnlAbajo.add(btnParImpar);
        
        pnlAbajo.setLayout(new GridLayout(1,5));
        
        add(pnlArriba);
        add(lblTexto);
        add(pnlAbajo);
    }
    
    public void shownWindowView() {
        setSize(700,300);
        setVisible(true);
    }
    
    public String getText() {
        return txtField.getText();
    }
    
    public int getNumber() {
        return Integer.parseInt(txtField.getText());
    }
    
    public void setIntVector(int[] number) {
        String text="";
        for(int i=0;i<number.length;i++) {
            text = text+number[i]+"  ";
        }
        lblTexto.setText(text);
    }
    
    public void setText(String text) {
        lblTexto.setText(text);
    }
    
    public void addBtnListener(ActionListener listenForBtn) {
        btnHello.addActionListener(listenForBtn);
        btnFibonacci.addActionListener(listenForBtn);
        btnBuscaMinas.addActionListener(listenForBtn);
        btnPalindromo.addActionListener(listenForBtn);
        btnParImpar.addActionListener(listenForBtn);
    }   
}
