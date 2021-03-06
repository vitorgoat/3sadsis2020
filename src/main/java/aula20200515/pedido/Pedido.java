package aula20200515.pedido;

import java.util.ArrayList;

public class Pedido {
	//- número : int
	private int número;
	
	//- itens (atributo de associação)
	private ArrayList<ItemPedido> itens = new ArrayList<>();
	
	//+ getNúmero() : int
	public int getNúmero() {
		return número;
	}
	
	//+ Pedido(número : int)
	public Pedido(int número) {
		this.número = número;
	}
	
	//+ adicionarItem(itemPedido : ItemPedido) : void
	public void adicionarItem(ItemPedido itemPedido) {
		this.itens.add(itemPedido);
	}
	 
	//+ getItens() : ArrayList<ItemPedido>
	public ArrayList<ItemPedido> getItens() {
		return itens;
	}

}
