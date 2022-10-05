package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu.Separator;
import javax.swing.KeyStroke;

import control.Controller;

public class MenuCadastro extends JMenuBar{
	
	JMenu cadastrarMenu, sairMenu;
	JMenuItem buscarItem, cadastrarItem, sairItem;
	Controller controller;
	
	
	public MenuCadastro() {
		super();
	
		cadastrarMenu = new JMenu("Cadastro");
		sairMenu = new JMenu("Sair");
		
		buscarItem = new JMenuItem("Buscar");
		cadastrarItem = new JMenuItem("Cadastrar");
		sairItem = new JMenuItem("Sair");
		
		add(cadastrarMenu);
		add(sairMenu);
		
		cadastrarMenu.add(cadastrarItem);
		cadastrarMenu.add(buscarItem);
		cadastrarMenu.addSeparator();
		cadastrarMenu.add(sairItem);
		
		cadastrarItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
		buscarItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.ALT_MASK));
	
		
	}
	public JMenu getCadastrarMenu() {
		return cadastrarMenu;
	}
	public JMenu getSairMenu() {
		return sairMenu;
	}
	public JMenuItem getBuscarItem() {
		return buscarItem;
	}
	public JMenuItem getCadastrarItem() {
		return cadastrarItem;
	}
	public JMenuItem getSairItem() {
		return sairItem;
	}
	
	
	
	
}
