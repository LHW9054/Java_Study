package product;

public class IndustrialProduct extends Product {
	
	String madeIn;

	public IndustrialProduct(String name, int price, String madeIn) {
		super(name, price);
		this.madeIn = madeIn;
	}

	@Override
	public String toString() {
		String format = "%s] %,d원 (made in %s)";
		Object[] args = { name, price, madeIn };
		return String.format(format, args);
	}
}
