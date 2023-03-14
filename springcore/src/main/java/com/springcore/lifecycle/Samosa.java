package com.springcore.lifecycle;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Samosa() {
		super();
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void hey()
	{
		System.out.println("Inside init method : How are you?");
	}
	
	public void bye()
	{
		System.out.println("Inside destroy method : bye bye");
	}
	
	

}
