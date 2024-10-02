package Escola;

public class UsuarioVip implements Usuario {
   
	private EscolaVirtual escola;
	public UsuarioVip(EscolaVirtual escola) {
		this.setEscola(escola);
	}
	
	
	@Override
	public void atualizar() {
		System.out.println("notificado  o usuario vip");
		
	}


	public EscolaVirtual getEscola() {
		return escola;
	}


	public void setEscola(EscolaVirtual escola) {
		this.escola = escola;
	}

}
