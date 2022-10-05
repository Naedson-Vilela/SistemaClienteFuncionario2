package App;

import javax.swing.JOptionPane;

import model.BaseDados;
import view.CadastroView;

public class app extends Thread{
	
	@Override
	public void run() {
		while (true) {
			try {
				System.out.println(BaseDados.getPessoas().size());
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
	
//		JOptionPane.showConfirmDialog(null, "Deseja mesmo fechar?", "Sair", JOptionPane.YES_NO_OPTION);

		BaseDados.createBase();
		new CadastroView();
		
//		new app().start();
		
		
	}
}
