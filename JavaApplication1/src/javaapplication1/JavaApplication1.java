package javaapplication1;

import javax.swing.JOptionPane;

public class JavaApplication1 {
    public static void main(String[] args) {
    int [][] valor = new int [2][2];
    int l=0, c=0;
    String total = " ";
    
    for (l=0; l < 2 ; l++){
        for(c=0; c < 2 ; c++){
            
      String x = JOptionPane.showInputDialog(null, "Digite o valor da linha " + l +" Digite o valor da coluna " + c);
      valor[l][c]= Integer.parseInt(x);
      total = total + valor[l][c] + " | "; 
           }
    total = total + "\n";
    
    }
    JOptionPane.showMessageDialog(null,valor);
}}
    
    
    
            

