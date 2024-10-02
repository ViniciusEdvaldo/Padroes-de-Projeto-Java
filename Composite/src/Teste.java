
public class Teste {

	public static void main(String[] args) {
		 
		// Crianção dos objetos Produto 
		Produto p1 = new Produto("mouse",10);
		Produto p2 = new Produto("teclado",100);
		Produto p3 = new Produto("caneta",10);
		Produto p4 = new Produto("monitor",500);

		//Criação da caixa
		Caixa caixa1 = new Caixa(); // caixa maior
        Caixa caixa2 = new Caixa(); // 
        
        caixa1.adicionaritemPedido(caixa2);
        caixa2.adicionaritemPedido(p1);
        caixa2.adicionaritemPedido(p2);
        caixa2.adicionaritemPedido(p3);
        caixa1.adicionaritemPedido(p4);
		
		Pedido pedido1 = new Pedido();
		pedido1.adicionarCaixa(caixa1);
		System.out.println("valor total: " + pedido1.calcularValorTotal());
		System.out.println("valor total: " + pedido1.calcularValorTotal());
		
	}

}
