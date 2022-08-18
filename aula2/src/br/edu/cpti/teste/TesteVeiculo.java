package br.edu.cpti.teste;

import br.edu.cpti.model.Caminhao;
import br.edu.cpti.model.VeiculoPasseio;

public class TesteVeiculo {

	public static void main(String[] args) {
		Caminhao c1 = new Caminhao();
		c1.setPlaca("KLI-0909");
		c1.setChassi("234343434");
		c1.setCargaMaxima(10500.);
		c1.setValor(55000);
		System.out.println("IPVA CAMINHÃO:" + c1.calcularIPVA());
		
		VeiculoPasseio v1 = new VeiculoPasseio();
		v1.setPlaca("hyu-9090");
		v1.setChassi("3432434");
		v1.setValor(15000);
		System.out.println("IPVA veiculo passeio:" + v1.calcularIPVA());
		
	}

}
