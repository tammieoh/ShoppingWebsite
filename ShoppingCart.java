

import java.util.ArrayList;

public class ShoppingCart {
	// instance variables
	ArrayList<Clothing> listOfProducts;
	Double totalPrice;
	Clothing product;
	
	
	// constructor
	public ShoppingCart() {
		this.listOfProducts = new ArrayList<Clothing>();
	}
	
	public ShoppingCart(ArrayList<Clothing> listOfProducts, Double totalPrice) {
		this.listOfProducts = new ArrayList<Clothing>();
		this.totalPrice = 0.;
	}
	
	// methods
	public ArrayList<Clothing> addProduct(Clothing newProduct) {	
		// if a product doesn't exist in the array, you add it
		// else don't do anything
			for(int i = 0; i < listOfProducts.size(); i++) {
				if(listOfProducts.get(i).equals(product)) {
					return listOfProducts;
				}
				else {
					listOfProducts.add(newProduct);
				}
			}
			return listOfProducts;
		}
	public ArrayList<Clothing> deleteProduct(Clothing product) {
		if(listOfProducts.contains(product)) {
			listOfProducts.remove(product);
		}
		return listOfProducts;
	}
	public double addTotal(ArrayList<Clothing> listOfProducts) {
		for(int i = 0; i < listOfProducts.size(); i++) {
			double totalPrice = 0;
			totalPrice+= listOfProducts.get(i).price;
		}
		return totalPrice;
	}
	
}
