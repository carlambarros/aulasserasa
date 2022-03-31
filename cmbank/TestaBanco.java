package cmbank;

public class TestaBanco {
	
	public static void main(String[] args) {
		
//		Pessoa pessoa1 = new Pessoa(); //criar uma instância = cópia
//		pessoa1.nome = "Carla Barros";
//		pessoa1.profissao = "DEV";
//		pessoa1.cpf = "199.515.960-37";
		
//		System.out.println("Nome: " + (pessoa1.nome));
//		System.out.println("Profissão: " + (pessoa1.profissao));
//		System.out.println("CPF: " + (pessoa1.cpf));
		
//		Pessoa pessoaNova = new Pessoa(); //instanciar classe pessoa
//		pessoaNova.setNome("Carla Barros");
//		System.out.println("Nome: " + pessoaNova.getNome());
//		
//		Pessoa pessoaCConstrutor = new Pessoa("Carla Barros", "199.515.960-37");
//		
//		System.out.println("Nome: "+ pessoaCConstrutor.getNome());
//		System.out.println("CPF: "+ pessoaCConstrutor.getCpf());
//		
		
		PessoaFisica pfCarla = new PessoaFisica();
		pfCarla.setNome("Carla Barros");
		pfCarla.setEmail("carlabarrositb@hotmail.com");
		pfCarla.setTelefone("3515158231353");
		pfCarla.setCpf("681.863.910-02");
		pfCarla.setProfissao("Programadora");
		pfCarla.setRg("48.044.360-9");
		
		
		Conta conta1 = new Conta();
		conta1.setAgencia(1234);
		conta1.setNumeroConta(7889);
		//conta1.setSaldo(1000000.50); >> Não se deve alterar diretamente essa informação. 
		//Ela apenas pode ser exibida, por isso também foi removido o set
		conta1.setTitular("Carla Barros");
		
		conta1.depositar(1000);
		
//		System.out.println("Agência: "+ conta1.getAgencia());
//		System.out.println("Conta: "+ conta1.getNumeroConta());
//		System.out.printf("Saldo: R$ %.2f \n", conta1.getSaldo());
//		System.out.println("Titular: "+ conta1.getTitular());
//		
//		if (conta1.sacar(200)) {
//			System.out.println("Saque efetuado com sucesso");
//		} else {
//			System.out.println("ERRO! Verifique o valor");
//		}
//		
//		Conta conta2 = new Conta();
//		
//		conta2.setAgencia(5582);
//		conta2.setNumeroConta(2234);
//
//
//		conta1.transferir(900, conta2);
//		
//		System.out.println("Saldo conta 1: "+ conta1.getSaldo());
//		System.out.println("Saldo conta 2: "+ conta2.getSaldo());
		
		ContaCorrente cc1 = new ContaCorrente();
		cc1.depositar(1000);
		System.out.println("Saldo: "+ cc1.getSaldo());
		System.out.println("Limite: "+ cc1.getLimite());
		System.out.println("Saldo com Limite: "+ cc1.getSaldoComLimite());
		
		cc1.sacar(1500);
		System.out.println("Saldo: "+ cc1.getSaldo());
		System.out.println("Saldo com Limite: "+ cc1.getSaldoComLimite());
		
		
	}
}
