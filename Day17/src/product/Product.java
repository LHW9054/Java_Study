package product;

public abstract class Product {

	String name;
	int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public abstract String toString();
}
