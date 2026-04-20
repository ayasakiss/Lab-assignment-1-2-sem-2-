package labAss12_Q1;

public class Book {

	private String name;
	private double price;
	private int qty;
	private Identification author;
	
	public Book(String name, Identification author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	
	//getters
	public String getName() {
		return name;
	}
	
	public Identification getAuthor() {
		return author;
	}
	
	public int getQty() {
		return qty;
	}
	
	public double getPrice() {
		return price;
	}
	
	//setters
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return name + " by " + author.toString() + " with price RM" + price;
	}
}
