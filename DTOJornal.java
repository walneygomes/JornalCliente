package oBSERVERR;

public class DTOJornal {
	private String nome;

	public DTOJornal(Jornal jornal) {
		this.nome = jornal.nomeJornal();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
