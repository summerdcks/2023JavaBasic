package ch4P1sample;

public class fruits {
	int price;
	String name;
	
	public fruits() {
		this(0, "None");
	}
	
	public fruits(int price, String name) {
		this.price = price;
		this.name = name;
	}
	
	
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	

}
