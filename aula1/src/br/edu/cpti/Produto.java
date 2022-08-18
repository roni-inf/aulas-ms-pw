package br.edu.cpti;

public class Produto {
	private int codigo;
	private String descricao;
	private double valor;
	//A variável vai pertence a classe e não ao objeto 
	private static int totalProdutos;
	//Construtor é formado pelo nome da classe não é void e não
	// tem retorno e ele é chamado na instanciação
	public Produto() {
		System.out.println("Construtor Default !");
	}
	
	//Sobrecarga - criando novo com argumentos diferentes
	public Produto(int codigo,String descricao, double valor) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		System.out.println("Construtor Cheio!");
		totalProdutos ++;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public static int getTotalProdutos() {
		return totalProdutos;
	}
	
}
