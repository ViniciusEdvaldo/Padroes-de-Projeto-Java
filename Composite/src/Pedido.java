
public class Pedido {
private double valorTotal;
private Caixa caixa; // caixa maior

public void adicionarCaixa(Caixa c) {
	this.caixa =c;
}

public double calcularValorTotal() {
	valorTotal = caixa.getPreco(); 
	return valorTotal;
 }

}
