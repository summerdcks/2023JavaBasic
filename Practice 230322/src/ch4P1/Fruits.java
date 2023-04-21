package ch4P1;

public class Fruits {
	int price;
	String name;
	
	public Fruits() {
		this(0, "None");
	}
	
	public Fruits(int price, String name) {
		this.price = price;
		this.name = name;
	}
	

	public void setPrice(int num) {
		if (num == 1) { price = 1000; }
		else if (num == 2) { price = 2000; }
		else if (num == 3) { price = 3000; }
		else if (num == 4) { price = 4000; }
		this.price = price;
		System.out.println("가격은 " + price + "원입니다.");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	

}
