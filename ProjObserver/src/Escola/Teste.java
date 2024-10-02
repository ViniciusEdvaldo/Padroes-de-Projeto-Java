package Escola;

public class Teste {

	public static void main(String[] args) {
		
		EscolaVirtual escola = new EscolaVirtual();
		UsuarioVip uservip1 = new UsuarioVip(escola);
		UsuarioNormal usernormal1 = new UsuarioNormal(escola);
		
		escola.adicionarUsuario(usernormal1);
		escola.adicionarUsuario(uservip1);
		
		MateriasGratuitos apostilha1 = new  MateriasGratuitos("apostilha do mes");
		EventoEspecial evento1 = new EventoEspecial("evento para vips");
		
		escola.adicionarEvento(evento1);
		escola.adicionarMaterial(apostilha1);

		
		
		
	}

}
