package Escola;
import java.util.ArrayList;

public  abstract class EscolaSenai {
     
	private ArrayList<Usuario> usuarios;
	
	
	public EscolaSenai() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public void adicionarUsuario(Usuario u) {
		this.usuarios.add(u);
	}
	
	public void retirarFuncionario(Usuario u) {
		this.usuarios.remove(u);
	}
	
	public void notificarEvento() {	
		for(int i =0; i<usuarios.size();i++) {
		 if(usuarios.get(i) instanceof UsuarioVip ) {
			usuarios.get(i).atualizar();
		}	
	}
	}
        public void notificarMaterial() {
		for(int i =0; i<usuarios.size();i++) {
			usuarios.get(i).atualizar();
		}
	
	}
	
}
