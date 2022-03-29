package cmbank;

public class Pessoa {
		
		private String nome;
		private String cpf;
		private String profissao;
		private String rg;
		private String email;
		
		public Pessoa() {
			
		}
		
		public Pessoa(String nome, String cpf) {
			super();
			this.nome = nome;
			this.cpf = cpf;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getProfissao() {
			return profissao;
		}
		public void setProfissao(String profissao) {
			this.profissao = profissao;
		}
		public String getRg() {
			return rg;
		}
		public void setRg(String rg) {
			this.rg = rg;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	
		
		
}
