package Arraylist;

public class Laptop {
	private String brand;
	private String colour;
	private int price;
	private int ram;
	private boolean isTouch;
	private String model;
	private String core;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setColour(String colour) {
		this.colour=colour;
	}
	public String getColour() {
		return colour;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getprice() {
		return price;
	}
	public void setRam(int ram) {
		this.ram=ram;
	}
	public int getRam() {
		return ram;
	}
	public void setCore(String core) {
		this.core=core;
	}
	public String getCore() {
		return core;
	}
	public void setBrand(boolean isTouch) {
		this.isTouch=isTouch;
	}
	public boolean getIsTouch() {
		return isTouch;
	}
	
	public Laptop(String brand,String colour,int price,String model,int ram,String core,boolean isTouch) {
		this.brand=brand;
		this.colour=colour;
		this.price=price;
		this.model=model;
		this.ram=ram;
		this.core=core;
		this.isTouch=isTouch;
	}
	public String toString() {
		return "Brand: "+brand+", Colour: "+colour+", Price: "+price+", Mode: "+model+", Ram: "+ram+", Core: "+core+", Touch: "+isTouch;
	}

}
