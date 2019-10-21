

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class Clothing {
	
	static final String SQL_PASSWORD = "Hoya0328!";
	// instance variables
	int id;
	String name;
	double price;
	String description;
	String fabricType;
	String size;
	String color;
	int rating;
	ArrayList<String> reviews;
	File image;
	
	// constructor
	public Clothing() {
		name = new String();
	}
}
