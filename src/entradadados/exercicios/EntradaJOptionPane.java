package entradadados.exercicios;

import javax.swing.JOptionPane;

public class EntradaJOptionPane{

	public static void main(String[] args){
		String palavra1 = JOptionPane.showInputDialog("Palavra 1:");
		String palavra2 = JOptionPane.showInputDialog("Palavra 2:");
		String palavra3 = JOptionPane.showInputDialog("Palavra 3:");
		JOptionPane.showMessageDialog(null, palavra1 + " " + palavra2 + " " + palavra3);
	}
}