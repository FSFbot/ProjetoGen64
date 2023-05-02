package freelas;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

public abstract class freelancers {

	private int numero;
	private String nome;
	private String celular;
	private int areaAtuacao;
	private float valor;

	public freelancers(int numero, String nome, String celular, int areaAtuacao, float valor) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.celular = celular;
		this.areaAtuacao = areaAtuacao;
		this.valor = valor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public int getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(int areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	

	public void visualizar() {

		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

		String areaAtuacao = "";

		switch (this.areaAtuacao) {
		case 1:
			areaAtuacao = "FullStack";
			break;
		case 2:
			areaAtuacao = "BackEnd";
			break;

		}
		System.out.println("\nID: " + this.numero);
		System.out.println("\nNome: " + this.nome);
		System.out.println("\nContato: " + this.celular);
		System.out.println("\nÁrea de atuação: " + areaAtuacao);
		System.out.println("\nValor por hora de serviço prestado: " + nf.format(this.valor));
		System.out.println("\n=============================================================");

	}
}
