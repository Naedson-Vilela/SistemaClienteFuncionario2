package view;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Mensagem extends JOptionPane{
	
	public static void exibirMensagemSucesso(String mensagem) {
		
		showMessageDialog(null, mensagem, "AVISO!", INFORMATION_MESSAGE);
		
	}
	
	public static void exibirMensagemFalha(String mensagem) {
		
		showMessageDialog(null, mensagem, "AVISO!", ERROR_MESSAGE);
		
	}
	
}
