package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.MenuBar;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import control.Controller;

public class CadastroView extends JFrame{
	
	JLabel subTituloLabel;
	MenuCadastro menuCadastro;
	PaineisTela paineisTela;
	
	Controller controller;
	
	
	public CadastroView() throws HeadlessException {
		super("Cadastro");
		setLayout(new BorderLayout());
		
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		
		subTituloLabel = new JLabel("Cadastrar");
		subTituloLabel.setFont(new Font("Arial", Font.BOLD, 30));
		subTituloLabel.setHorizontalAlignment(SwingConstants.CENTER); //ELITE
		
//		label1.setHorizontalAlignment(SwingConstants.CENTER);
//		cadastrarLabel.setAlignmentX(CENTER_ALIGNMENT);
		
		
		paineisTela = new PaineisTela();
		setContentPane(paineisTela);

		menuCadastro = new MenuCadastro();
		
		controller = new Controller(menuCadastro, this, paineisTela);
		
		menuCadastro.getBuscarItem().addActionListener(controller.getMenuHanddler());
		menuCadastro.getCadastrarItem().addActionListener(controller.getMenuHanddler());
		
		setJMenuBar(menuCadastro);
		
		add(subTituloLabel, BorderLayout.NORTH);
		
		
		setVisible(true);
	}


	public JLabel getSubTituloLabel() {
		return subTituloLabel;
	}


	


	public PaineisTela getPaineisTela() {
		return paineisTela;
	}


	public MenuCadastro getMenuCadastro() {
		return menuCadastro;
	}


	public Controller getController() {
		return controller;
	}


	
	
	
	
	
	
	
}	
