package cmbank;

public class Conta {
	
	//declara??o de atributos
	
	private int agencia;
	private int numeroConta;
	protected double saldo;
	private String titular;
	
	
	// m?todo construtor padr?o (default)
	public Conta() {

	}

	//m?todo construtor com sobrecarga
	public Conta(int agencia, int numeroConta, String titular) {
		super();
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = 0;
	}

	//m?todos
	
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor; //saldo = saldo + valor
			
		}
	}
	
	public boolean sacar(double valor) {
		if ((valor > 0) && (saldo >= valor)) {
			saldo -= valor;
			return true;
		}
		
		return false;
	}
	
	public boolean transferir(double valor, Conta destinatario) {
		if ((valor > 0) && (saldo >= valor)) {
			saldo -= valor;
			destinatario.depositar(valor);
			return true;
		}
		
		return false;
	}
	
	
	// Encapsulamento (get e set)
	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public int getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}


	public double getSaldo() {
		return saldo;
	}


	public String getTitular() {
		return titular;
		
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
	
	

}
