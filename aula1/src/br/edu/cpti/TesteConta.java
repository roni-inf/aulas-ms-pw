package br.edu.cpti;

public class TesteConta {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		conta1.setNumeroConta("123");
		conta1.setSaldo(5000.0);
		conta1.deposito(100.0);
		System.out.println("Conta:"+conta1.getNumeroConta() 
				+" saldo:"+ conta1.getSaldo());
		System.out.println(conta1.saque(1000.) 
				+" Saldo após saque:"+ conta1.getSaldo());

		
		Conta conta2 = new Conta();
		conta2.setNumeroConta("234");
		conta2.setSaldo(2000.);
		conta2.deposito(200.0);
		System.out.println("Conta:"+conta2.getNumeroConta() 
				+" saldo:"+ conta2.getSaldo());
		System.out.println(conta2.saque(2000.) 
				+" Saldo após saque:"+ conta2.getSaldo());
		
	}
}
