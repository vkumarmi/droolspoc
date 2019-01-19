package com.golo.poc;

public class CartItem {
	private Product product=new Product();
	private CartStatus cartStatus;

	public CartStatus getCartStatus() {
		return cartStatus;
	}

	public void setCartStatus(CartStatus cartStatus) {
		this.cartStatus = cartStatus;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "CartItem [product=" + product + ", cartStatus=" + cartStatus
				+ "]";
	}

}
