package model;

public class Cliente extends Pessoa{

	private boolean receberPropaganda;

	public Cliente(String nome, String cpf, boolean receberPropaganda) {
		super(nome, cpf);
		this.receberPropaganda = receberPropaganda;
	}
	
	

}
