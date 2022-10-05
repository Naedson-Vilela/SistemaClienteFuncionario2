package model;

public class Funcionario extends Pessoa{
	private static int num;
	private int id;
	private String cargo;
	
	public Funcionario(String nome, String cpf, String cargo) {
		super(nome, cpf);
		num++;
		this.id = num;
		this.cargo = cargo;
	}
	
	
}
