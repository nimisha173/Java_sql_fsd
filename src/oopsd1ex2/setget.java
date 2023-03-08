package oopsd1ex2;

public class setget {
   private String Color;
   private double Price;
   private String Brand;
public String getColor() {
	return Color;
}
public void setColor(String color) {
	Color = color;
}
public double getPrice() {
	return Price;
}
public void setPrice(double price) {
	Price = price;
}
public String getBrand() {
	return Brand;
}
public void setBrand(String brand) {
	Brand = brand;
}
public setget(String color, double price, String brand) {
	super();
	Color = color;
	Price = price;
	Brand = brand;
}

}
