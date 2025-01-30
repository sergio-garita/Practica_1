
package practica_1;

import javax.swing.JOptionPane;

public class Practica_1 {

    
    public static void main(String[] args) {
        double salario = 0;
        double SEM = 0;
        double IVM = 0;
        double total = 0;

        String VariableTemporal = "";
        VariableTemporal = JOptionPane.showInputDialog("Digite su salario semanal: ");
        salario = Double.parseDouble(VariableTemporal);
        SEM = salario * 0.0925;
        IVM = salario * 0.0508;
        total = SEM + IVM;
        JOptionPane.showMessageDialog(null, "Este es el total a pagar por la caja " + total);

    }

}
