
public class User {
	// instance variables
	int id = 0;
	String username;
	String token;
	String password;
	ShoppingCart shoppingCart;
	WishList wishList; 
	
	// constructor
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public User(String username, String password, ShoppingCart shoppingCart, WishList wishList) {
		this.username = username;
		this.password = password;
		this.shoppingCart = shoppingCart;
		this.wishList = wishList;
	}


}
