import java.util.ArrayList;

public class Caixa implements ItemPedido {
	
private ArrayList<ItemPedido> itens;

public Caixa() { 
	this.itens = new ArrayList<ItemPedido>();
}

public double getPreco() {
	double valorTotal =0; 
	for(int i=0; i<itens.size();i++) {
		valorTotal += itens.get(i).getPreco(); // 120+500
	} return valorTotal;
}

public void adicionaritemPedido(ItemPedido item ) {
	this.itens.add(item);
}

}
