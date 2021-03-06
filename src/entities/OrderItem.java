package entities;

public class OrderItem {

	private Integer quantity;
	
	private Product product;
	
	public OrderItem() {
	}

	public OrderItem(Integer quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
		return;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double subTotal() {
		return quantity * product.getPrice();
	}

	@Override
	public String toString() {
		return product.getName()
				+ ", $"
				+ String.format("%.2f", product.getPrice())
				+ ", Quantity: "
				+ quantity
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
	
	
	
}
