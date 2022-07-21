package entities;

public class Bill {

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double cover() {
		return 4.0;
	}
	
	public double ticket() {
		if(gender == 'M' || gender == 'm') {
			return 10.0;
		} else {
			return 8.0;
		}
	}
	
	public double feeding() {
		return (beer * 5.0) + (barbecue * 7.0) + (softDrink * 3.0);
	}
	
	public double total() {
		if(feeding() > 30.0) {
			return feeding() + ticket();
		} else {
			return feeding() + ticket() + cover();
		}
	}
}