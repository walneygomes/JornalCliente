package oBSERVERR;

public class Cliente {
	private final static int VALOR = 2;
	private String[] dadosNotici;
	private String nome;
	private String cpf;
	private int idade;
	private String cnh;

	public void addNotificao(String tecto, DTOJornal jornal) {
		this.setDadosNotici(new String[VALOR]);
		getDadosNotici()[0] = tecto;
		getDadosNotici()[1] = jornal.getNome();

	}

	public void notifica() {
		System.out.println("Notificacao de :" + this.getDadosNotici()[1]);
		System.out.println("NOTICIA :" + this.getDadosNotici()[0]);

	}

	public String[] getDadosNotici() {
		return dadosNotici;
	}

	public void setDadosNotici(String[] dadosNotici) {
		this.dadosNotici = dadosNotici;
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnh == null) ? 0 : cnh.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (cnh == null) {
			if (other.cnh != null)
				return false;
		} else if (!cnh.equals(other.cnh))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;

		return true;
	}

}
