package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardLayoutTest extends JPanel {

	CardLayout cardLayout = null;
	JPanel mainPanel = null;
	JPanel panel1 = null;
	JPanel panel2 = null;
	JPanel panel3 = null;

	public CardLayoutTest() {
		this.initialize();
	}

	protected void initialize() {
		this.setLayout(new BorderLayout());
		this.add(getPanel(), BorderLayout.CENTER);
		this.add(getButtonPanel(), BorderLayout.SOUTH);
	}

	public JPanel getButtonPanel() {
		JPanel buttonPanel = new JPanel();

		JButton b = new JButton("1");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(mainPanel, "panel1");
			}
		});
		buttonPanel.add(b);

		b = new JButton("2");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(mainPanel, "panel2");
			}
		});
		buttonPanel.add(b);

		b = new JButton("3");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(mainPanel, "panel3");
			}
		});
		buttonPanel.add(b);

		return buttonPanel;
	}

	public JPanel getPanel1() {
		if (panel1 == null) {
			panel1 = new JPanel();
			panel1.setBackground(Color.WHITE);
			panel1.add(new JLabel("Panel1"));
		}
		return panel1;
	}

	public JPanel getPanel2() {
		if (panel2 == null) {
			panel2 = new JPanel();
			panel2.setBackground(Color.LIGHT_GRAY);
			panel2.add(new JLabel("Panel2"));
		}
		return panel2;
	}

	public JPanel getPanel3() {
		if (panel3 == null) {
			panel3 = new JPanel();
			panel3.setBackground(Color.CYAN);
			panel3.add(new JLabel("Panel3"));
		}
		return panel3;
	}

	public CardLayout getCardLayout() {
		if (cardLayout == null) {
			cardLayout = new CardLayout();
		}
		return cardLayout;
	}

	public JPanel getPanel() {
		if (mainPanel == null) {
			mainPanel = new JPanel(getCardLayout());
			mainPanel.add(getPanel1(), "panel1");
			mainPanel.add(getPanel2(), "panel2");
			mainPanel.add(getPanel3(), "panel3");
			getCardLayout().show(mainPanel, "panel1");
		}
		return mainPanel;
	}

//	public static void main(String[] args) {
//		JFrame frame = new JFrame();
//		frame.setContentPane(new CardLayoutTest());
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(500, 400);
//		frame.setVisible(true);
//	}
}