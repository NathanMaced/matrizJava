package exer;
import javax.swing.JOptionPane;
public class Exer {
    public static void main(String[] args) {
       int [][] m = new int [2][2]; 
       int [][] n = new int [2][2];
       int [][] p = new int [2] [2];
       int [][] s = new int [2] [2];
       int [][] d = new int [2] [2];
       int l = 0, c = 0;
       String total = "";
       
       
       for (l=0; l < 2 ; l++){
        for(c=0; c < 2 ; c++){
            String x = JOptionPane.showInputDialog(null, "Digite o valor da linha (m) " + l +" Digite o valor da coluna (m) " + c);
      m[l][c]= Integer.parseInt(x);
      String y = JOptionPane.showInputDialog(null, "Digite o valor da linha (n) " + l +" Digite o valor da coluna (n) " + c);
      n[l][c]= Integer.parseInt(y);
      }
    }
       for (l=0; l < 1 ;l++){
        for(c=0; c < 1 ;c++){
      
      p[l][c]= m[l][c] * n[l][c];
       JOptionPane.showMessageDialog(null,p);
      s[l][c]= m[l][c] + n[l][c];
       JOptionPane.showMessageDialog(null,s);
      d[l][c]= m[l][c] - n[l][c];
       JOptionPane.showMessageDialog(null,d);
        }}
       
    }
    }
    