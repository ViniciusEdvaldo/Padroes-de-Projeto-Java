package Gmails;

public class Email {

	private String enderecoRemetente;
	private String enderecoDestino;
	
	public Email(String er , String ed) {
		this.enderecoDestino =ed;
		this.enderecoRemetente =er;
	}

	public String getEnderecoRemetente() {
		return enderecoRemetente;
	}

	public void setEnderecoRemetente(String enderecoRemetente) {
		this.enderecoRemetente = enderecoRemetente;
	}

	public String getEnderecoDestino() {
		return enderecoDestino;
	}

	public void setEnderecoDestino(String enderecoDestino) {
		this.enderecoDestino = enderecoDestino;
	}
	
}

