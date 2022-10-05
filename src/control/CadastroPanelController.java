package control;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import model.BaseDados;
import model.Cliente;
import model.Funcionario;
import model.PessoaException;
import view.CadastroPanel;
import view.CadastroView;
import view.Mensagem;

public class CadastroPanelController extends MouseAdapter {

	CadastroPanel cadastroPanel;

	public CadastroPanelController(CadastroPanel cadastroPanel) {
		super();
		this.cadastroPanel = cadastroPanel;
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		if (cadastroPanel.getClienteRadio().isSelected()) {

			cadastroPanel.getCargoLabel().setVisible(false);
			cadastroPanel.getCargoField().setVisible(false);
			cadastroPanel.getPropagandaBox().setVisible(true);

		}
		if (cadastroPanel.getFuncionarioRadio().isSelected()) {

			cadastroPanel.getCargoLabel().setVisible(true);
			cadastroPanel.getCargoField().setVisible(true);
			cadastroPanel.getPropagandaBox().setVisible(false);

		}

		if (e.getSource() == cadastroPanel.getAdicionarButton()) {
			// Logica de adicionar

			if (cadastroPanel.getClienteRadio().isSelected()) {

				try {
					if (BaseDados.addPessoa(new Cliente(cadastroPanel.getNomeField().getText(),
							cadastroPanel.getCpfField().getText(), cadastroPanel.getPropagandaBox().isEnabled()))) {
						Mensagem.exibirMensagemSucesso(BaseDados.pessoaAdicionada);
					}
				} catch (HeadlessException e1) {
					e1.printStackTrace();
				} catch (PessoaException e1) {
					JOptionPane.showMessageDialog(null, "Erro ao adicionar cliente");
					e1.printStackTrace();
				}

			}
			if (cadastroPanel.getFuncionarioRadio().isSelected()) {

				try {
					if (BaseDados.addPessoa(new Funcionario(cadastroPanel.getNomeField().getText(),
							cadastroPanel.getCpfField().getText(), cadastroPanel.getCargoField().getText()))) {
						Mensagem.exibirMensagemSucesso(BaseDados.pessoaAdicionada);
					}
				} catch (HeadlessException | PessoaException e1) {
					JOptionPane.showMessageDialog(null, "Erro ao adicionar funcionário");
					e1.printStackTrace();
				}

			}
			cadastroPanel.getNomeField().setText(null);
			cadastroPanel.getCpfField().setText(null);
			cadastroPanel.getCargoField().setText(null);

		}
		super.mouseClicked(e);
	}
}
