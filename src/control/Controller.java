package control;

import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import view.CadastroView;
import view.MenuCadastro;
import view.PaineisTela;

public class Controller {
	
	MenuCadastro menuCadastro;
	CadastroView cadastroView;
	PaineisTela paineisTela;
	MenuHanddler menuHanddler;
	
	public Controller(MenuCadastro menuCadastro, CadastroView cadastroView, PaineisTela paineisTela) {
		super();
		this.menuCadastro = menuCadastro;
		this.cadastroView = cadastroView;
		this.paineisTela = paineisTela;
		this.menuHanddler = new MenuHanddler();
	}


	private class MenuHanddler implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == menuCadastro.getBuscarItem()) {
				cadastroView.getPaineisTela().getCardLayout().show(cadastroView.getPaineisTela().getPainelPrincipal(), "buscarPanel");
				
				cadastroView.getSubTituloLabel().setText("Buscar");
//				cadastroView.getCadastroPanel().setVisible(false);
//				cadastroView.getBuscarPanel().setVisible(true);
//				System.out.println("porraaaaaaaaaaaaaaaaaa");
				
			}
//			
			if(e.getSource() == menuCadastro.getCadastrarItem()) {
//				cadastroView.getCadastroPanel().setVisible(true);
				
				cadastroView.getPaineisTela().getCardLayout().show(cadastroView.getPaineisTela().getPainelPrincipal(), "cadastroPanel");
				
				
				cadastroView.getSubTituloLabel().setText("Cadastrar");
//				cadastroView.getPaineisTela().getCadastroPanel().setVisible(true);
				
//				cadastroView.getBuscarPanel().setVisible(false);
//				cadastroView.getCadastroPanel().setVisible(true);
//				System.out.println("Porraaa");
			}
			
		}
		
		
	}


	public MenuHanddler getMenuHanddler() {
		return menuHanddler;
	}
	
}
