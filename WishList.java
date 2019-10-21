
import java.util.ArrayList;

public class WishList {
	// instance variables
	Clothing product;
	ArrayList<Clothing> listOfProducts;
	
	// constructor
	public WishList() {
		this.product = new Clothing();
		this.listOfProducts = new ArrayList<Clothing>();
	}
	
	// methods
	public ArrayList<Clothing> addProduct(Clothing newProduct) {	
	// if a product doesn't exist in the array, you add it
	// else don't do anything
		for(int i = 0; i < listOfProducts.size(); i++) {
			if(listOfProducts.get(i).equals(product)) {
				return listOfProducts;
			}
			else 
				listOfProducts.add(newProduct);
			}
		return listOfProducts;
	}
	public ArrayList<Clothing> deleteProduct(Clothing product) {
		if(listOfProducts.contains(product)) {
			listOfProducts.remove(product);
		}
		return listOfProducts;
	}
}
