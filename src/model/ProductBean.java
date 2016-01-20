package model;

public class ProductBean {
	private int bookID;
	private String bookName;
	private String bookEdition;
	private String gener;
	private int qunatity;
	private double price;
	private String imageURL;
	private String details;
	
	public void setBookID(int bookID){
		this.bookID = bookID;			
	}
	
	public void setBookName(String bookName){
		this.bookName = bookName;
	}
	
	public void setBookEdition(String bookEdition){
		this.bookEdition = bookEdition;
	}
	
	public void setGener(String gener){
		this.gener = gener;
	}
	
	public void setQuantity(int quantity){
		this.qunatity = quantity;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public void setImageURL(String imageURL){
		this.imageURL = imageURL;
	}
	
	public void setDetails(String details){
		this.details = details;
	}
	
	public int getBookID(){
		return bookID;			
	}
	
	public String getBookName(){
		return bookName;
	}
	
	public String getBookEdition(){
		return bookEdition;
	}
	
	public String getGener(){
		return gener;
	}
	
	public int getQuantity(){
		return qunatity;
	}
	
	public double getPrice(){
		return price;
	}
	
	public String getImageURL(){
		return imageURL;
	}
	
	public String getDetails(){
		return details;
	}

}
