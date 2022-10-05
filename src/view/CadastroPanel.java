package view;

import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.text.MaskFormatter;

import control.CadastroPanelController;
import model.Cliente;
import util.SpringUtilities;

public class CadastroPanel extends JPanel{
	
	ButtonGroup radioGroup;
	JRadioButton clienteRadio, funcionarioRadio;
	JLabel tipoLabel, nomeLabel, cpfLabel, cargoLabel;
	JTextField nomeField, cpfField, cargoField;
	JCheckBox propagandaBox;
	JButton adicionarButton;
	CadastroPanelController cadastroPanelController;
	
	
	public CadastroPanel() {
		setSize(200, 300);
		
		JPanel container = new JPanel(new SpringLayout());
		
		setLayout(new BorderLayout());
		cadastroPanelController = new CadastroPanelController(this);
		
		radioGroup = new ButtonGroup();
		
		clienteRadio = new JRadioButton("Cliente", true);
		clienteRadio.addMouseListener(cadastroPanelController);
		
		funcionarioRadio = new JRadioButton("Funcionário");
		funcionarioRadio.addMouseListener(cadastroPanelController);
		
		radioGroup.add(clienteRadio);
		radioGroup.add(funcionarioRadio);
		
		tipoLabel = new JLabel("Tipo:");
		nomeLabel = new JLabel("Nome");
		cpfLabel = new JLabel("CPF");
		cargoLabel = new JLabel("Cargo");
		cargoLabel.setVisible(false);
		
		
		nomeField = new JTextField(20);
		try {
			cpfField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			cpfField.setColumns(20);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cargoField = new JTextField(20);
		cargoField.setVisible(false);
		
		propagandaBox = new JCheckBox("Aceita receber propagandas.", true);
		
		adicionarButton = new JButton("Adicionar");
		adicionarButton.addMouseListener(cadastroPanelController);
		
		JPanel radioPanel = new JPanel(new SpringLayout());
		
		radioPanel.add(clienteRadio);
		radioPanel.add(funcionarioRadio);
		
		container.add(tipoLabel);
		container.add(radioPanel);
		
		container.add(nomeLabel);
		container.add(nomeField);
		
		container.add(cpfLabel);
		container.add(cpfField);
		
		container.add(cargoLabel);
		container.add(cargoField);
		
		add(container, BorderLayout.CENTER);
		
		add(adicionarButton, BorderLayout.EAST);
		
		add(propagandaBox, BorderLayout.PAGE_END);
		
		
		
		SpringUtilities.makeCompactGrid(radioPanel, 1, 2, 2, 2, 2, 2);
		SpringUtilities.makeCompactGrid(container, 4, 2, 2, 2, 10, 15);
//		SpringUtilities.makeCompactGrid(adicionarButton, 1, 1, 10, 10, 10, 10);
	}


	public ButtonGroup getRadioGroup() {
		return radioGroup;
	}


	public JRadioButton getClienteRadio() {
		return clienteRadio;
	}


	public JRadioButton getFuncionarioRadio() {
		return funcionarioRadio;
	}


	public JLabel getTipoLabel() {
		return tipoLabel;
	}


	public JLabel getNomeLabel() {
		return nomeLabel;
	}


	public JLabel getCpfLabel() {
		return cpfLabel;
	}


	public JLabel getCargoLabel() {
		return cargoLabel;
	}


	public JTextField getNomeField() {
		return nomeField;
	}


	public JTextField getCpfField() {
		return cpfField;
	}


	public JTextField getCargoField() {
		return cargoField;
	}


	public JCheckBox getPropagandaBox() {
		return propagandaBox;
	}


	public JButton getAdicionarButton() {
		return adicionarButton;
	}


	
	
}
