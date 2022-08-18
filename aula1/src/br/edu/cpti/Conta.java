package br.edu.cpti;

public class Conta {
	// Padrão CamelCase
	//Encapsulamento
	//Acessível via getter and setter
	private String numeroConta;
	private Double saldo;

	//Entrada de dados via set<Nome do Atributo>
	public void setNumeroConta(String numeroConta) {
		// this - atributo
		this.numeroConta = numeroConta;
	}
	
	//Leitura de dados via get<Nome do Atributo>
	public String getNumeroConta() {
		return numeroConta;
	}
	
			
	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	// Métodos sem retorno
	public void deposito(Double valor) {
		saldo += valor;
	}

	// Método com retorno
	public String saque(Double valor) {
		if (saldo < valor) {
			return "Saldo insuficiente !";
		} else {
			saldo -= valor;
			return "Saque efetuado com sucesso !";
		}
	}
}
