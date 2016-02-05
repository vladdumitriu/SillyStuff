package main;

public class ShoppingCart {
	private int index = 0;
	private Product [] productList = new Product[index];
	
	public void addProduct(Product product){
		index++;
		productList[index]=product;
	}
	public void removeProduct(Product product){
		index--;
	}
//	public Product showList(){
//		for(int i=0;i<=cont;i++){
//			return productList[i];
//		}
//	}
	
}
