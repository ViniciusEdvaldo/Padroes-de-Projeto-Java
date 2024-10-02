package Escola;

public class UsuarioNormal implements Usuario{

	private EscolaVirtual escola;
	
	public UsuarioNormal(EscolaVirtual escola) {
		this.setEscola(escola);
	}
	@Override
	public void atualizar() {
		System.out.println("notificado  o usuario normal");
		
	}
	public EscolaVirtual getEscola() {
		return escola;
	}
	public void setEscola(EscolaVirtual escola) {
		this.escola = escola;
	}

}
