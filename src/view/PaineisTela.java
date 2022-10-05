package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JPanel;

public class PaineisTela extends JPanel{

	CardLayout cardLayout;
	JPanel painelPrincipal;
	CadastroPanel cadastroPanel;
	BuscarPanel buscarPanel;
	
	
	
	public PaineisTela() {
		
		cardLayout = new CardLayout();
		cadastroPanel = new CadastroPanel();
		buscarPanel = new BuscarPanel();
		painelPrincipal = new JPanel(cardLayout);
		painelPrincipal.add(cadastroPanel, "cadastroPanel");
		painelPrincipal.add(buscarPanel, "buscarPanel");
		
		inicializar();
	}

	private void inicializar() {
		setLayout(new BorderLayout());
		add(painelPrincipal, BorderLayout.CENTER);
//		cardLayout.show(painelPrincipal, "cadastroPanel");
	}

	public CardLayout getCardLayout() {
		return cardLayout;
	}

	public JPanel getPainelPrincipal() {
		return painelPrincipal;
	}

	public CadastroPanel getCadastroPanel() {
		return cadastroPanel;
	}

	public BuscarPanel getBuscarPanel() {
		return buscarPanel;
	}
	
	
	
	
	
	
	
	
}
