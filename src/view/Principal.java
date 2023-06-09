package view;

import javax.swing.JOptionPane;

import controller.SomatorioController;

public class Principal {

	public static void main(String[] args) {
		SomatorioController somaCont = new SomatorioController();
		
		do {
			try {
				String input = JOptionPane.showInputDialog("Digite um número natural: ", "");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "Encerrando");
					System.exit(0);
				}
				int n = Integer.parseInt(input);
				JOptionPane.showMessageDialog(null, "Somatório dos " + n + " primeiros números naturais: " + somaCont.somatorio(n));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Número inválido");
				continue;
			}
			break;
		} while(true);
	}

}
