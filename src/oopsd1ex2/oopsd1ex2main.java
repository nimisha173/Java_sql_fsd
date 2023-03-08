package oopsd1ex2;

public class oopsd1ex2main {
	public static void main(String[]args) {
    setget volvo= new setget("red",2345,"avs");
    System.out.println(volvo.getColor());
    System.out.println(volvo.getPrice());
    System.out.println(volvo.getBrand());
    
    
    setget bmw= new setget("white",2348,"aks");
    System.out.println(bmw.getColor());
    System.out.println(bmw.getPrice());
    System.out.println(bmw.getBrand());
    
    }
}
