package product;

public class Food extends Product {
	
	String expireDate;	// 유통기한

	public Food(String name, int price, String expireDate) {
		super(name, price);
		this.expireDate = expireDate;
	}

	@Override
	public String toString() {
		String format = "%s] %,d원 (유통기한 : %s)";
		Object[] args = { name, price, expireDate };
		return String.format(format, args);
	}
}
