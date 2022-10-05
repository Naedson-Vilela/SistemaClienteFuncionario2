package view;

import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.text.ParseException;
import java.time.temporal.JulianFields;

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

public class BuscarPanel extends JPanel{

	JLabel cpfLabel;
	JTextField cpfField;
	JButton buscarButton;
	
	public BuscarPanel() {
		
		setLayout(new BorderLayout());
		
		JPanel cpfPanel = new JPanel(new SpringLayout());
		
		
		cpfLabel = new JLabel("CPF");
		cpfField = new JTextField(20);
		
		cpfPanel.add(cpfLabel);
		cpfPanel.add(cpfField);
		
		buscarButton = new JButton("Buscar");
		
		add(cpfPanel, BorderLayout.CENTER);
		add(buscarButton, BorderLayout.SOUTH);
		
		SpringUtilities.makeCompactGrid(cpfPanel, 1, 2, 50, 3, 25, 150);
		
		
	}

	

}
