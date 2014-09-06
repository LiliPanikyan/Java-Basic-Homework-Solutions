
public class Order {
	private String name;
	private double quantity;

	public String getName(){
		return name;
	}
	
	public double getQuantity(){
		return quantity;
	}

	public Order(String name, double quantity) {
		this.name = name;
		this.quantity = quantity;
	}
}
