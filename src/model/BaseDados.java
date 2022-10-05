package model;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

public class BaseDados {

	private static ArrayList<Pessoa> pessoas;

	public static final String pessoanNull = "Dados inválidos!";
	public static final String pessoaDuplicada = "CPF já cadastrado!";
	public static final String pessoaAdicionada = "Adicionado com sucesso!";
	
	public static void createBase() {
		BaseDados.inicializarBase();
	}

	private static void inicializarBase() {
		pessoas = new ArrayList<Pessoa>();
	}

	public static boolean addPessoa(Pessoa pessoa) throws PessoaException { // Só uma pessoa por CPF
		if (pessoa == null || pessoa.getNome().equals("") || pessoa.getCpf().equals("")) { // PessoaNull
			throw new PessoaException(pessoanNull);
		}
		if(isPessoa(pessoa.getCpf()) != true) { // so executa se isPessoa for false
			pessoas.add(pessoa);
			return true;
		}
		throw new PessoaException(pessoaDuplicada); //Pessoa Já existe
	}
	
	public static boolean removerPessoa(Pessoa pessoa) {
		if(pessoa == null) {
			return false;
		}
		if(isPessoa(pessoa)) { // so executa se a pessoa estiver na base
			pessoas.remove(BaseDados.buscarPessoa(pessoa));
			return true;
		}
		return false;
	}
	
	private static boolean atualizarPessoa(Pessoa pessoaOld, Pessoa pessoaNew) {
		if(pessoaOld==null || pessoaNew == null) {
			return false;
		}
		if(isPessoa(pessoaOld)) {	
			pessoas.set(pessoas.indexOf(pessoaOld), pessoaNew);
			return true;
		}
		return false;
	}
	
	private static Pessoa buscarPessoa(Pessoa pessoa) {
		if(pessoa == null)
			return null;
		else {	
			for(Pessoa pessoaCurrent : pessoas) {
				if(pessoaCurrent.equals(pessoa))
					return pessoaCurrent;
			}
		}
		return null;
	}
	
	private static Pessoa buscarPessoa(String cpf) {
		if(cpf == null) {
			return null;
		}else {
			for(Pessoa pessoaCurrent : pessoas) {
				if(pessoaCurrent.getCpf().equalsIgnoreCase(cpf)) {
					return pessoaCurrent;
				}
			}
		return null;
		}
	}
	
	public static boolean isPessoa(Pessoa pessoa) {
		if(pessoas.contains(BaseDados.buscarPessoa(pessoa))) {
			return true;
		}
		return false;
	}
	
	public static boolean isPessoa(String cpf) {
		if(pessoas.contains(BaseDados.buscarPessoa(cpf))) {
			return true;
		}
		return false;
	}

	public static ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}
}
