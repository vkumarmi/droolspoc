package com.golo.poc;

import java.util.ArrayList;
import java.util.List;


public class Customer {
	private String id;
	private Cart cart;
	private String coupon;
	private boolean isNew;
	private List<Product> registeredProducts = new ArrayList<Product>();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public String getCoupon() {
		return coupon;
	}
	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}
	public boolean isNew() {
		return isNew;
	}
	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}
	public List<Product> getRegisteredProducts() {
		return registeredProducts;
	}
	public void setRegisteredProducts(List<Product> registeredProducts) {
		this.registeredProducts = registeredProducts;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", cart=" + cart + ", coupon=" + coupon
				+ ", isNew=" + isNew + ", registeredProducts="
				+ registeredProducts + "]";
	} 

}
