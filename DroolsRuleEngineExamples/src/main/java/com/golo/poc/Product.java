package com.golo.poc;

public class Product {
	private long id;
	private String name;
	private String description;
	private double mrp;
	private double sellingPrice;
	private int availableQty;
	private double cost;
	private boolean isOutOfStock;
	public long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description="
				+ description + ", mrp=" + mrp + ", sellingPrice="
				+ sellingPrice + ", availableQty=" + availableQty + ", cost="
				+ cost + ", isOutOfStock=" + isOutOfStock + "]";
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getMrp() {
		return mrp;
	}
	public void setMrp(double mrp) {
		this.mrp = mrp;
	}
	public double getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	
	public int getAvailableQty() {
		return availableQty;
	}
	public void setAvailableQty(int availableQty) {
		this.availableQty = availableQty;
	}
	public boolean isOutOfStock() {
		return isOutOfStock;
	}
	public void setOutOfStock(boolean isOutOfStock) {
		this.isOutOfStock = isOutOfStock;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
}
