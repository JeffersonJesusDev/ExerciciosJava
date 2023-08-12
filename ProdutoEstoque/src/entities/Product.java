package entities;

public class Product {
	public String name;
	public double price;
	public double quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	public void AddProducts(int quantity) { //Adicionar produto: Ter o que já tem na quantidade e adicionar no que já tem nele
		this.quantity += quantity; //THis é para ter referencia a objeto, acessar atributo da classe.
	}
	public void ReemoveProducts(int quantity) { //Remover produto
		this.quantity -= quantity;
	}
		
	public String toString() {
		return name + ", $" +  price + ", " + quantity + " units, Total: "
				+ totalValueInStock();
	
	}
}
