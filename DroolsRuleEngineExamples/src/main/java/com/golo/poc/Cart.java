package com.golo.poc;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<CartItem> cartItems=new ArrayList<CartItem>();
	private double discount;
	private double totalAmount;

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "Cart [cartItems=" + cartItems + ", discount=" + discount
				+ ", totalAmount=" + totalAmount + "]";
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

}
