package cars;

public class cars {
	
	import java.util.ArrayList; 


	public class Car {
		
		private String model;
		private String make;
		private int year;
		private double price;

		public Car(String make, String model, int year, double price) { 
			this.make = make;
			this.model = model;
			this.year = year;
			this.price = price; 
			
			
		}
		
		public void setMake(String make) {
			this.make = make;
		}
		public void setModel(String model) {
			this.model = model;
		}	
		public void setYear(int year) {
			this.year = year;
		}	
		public void setPrice(int price) {
			this.price = price;
			
		}
		
		public String getMake() {
			return make;
			
		}
		
		public String getModel() {
			return model;
		
		}
		
		public int getYear() {
			return year;
		}

		public double getPrice() {
			return price;
		}
		 
		public String toString()  {

			return "The ake of your car is" + getMake() + ", model of the car is " + getModel() + ", and year of the car is " + getYear; 
	//you forgot ‘m’ =) and your price variable
			
		

	 }

		public static Object size() {
			// TODO Auto-generated method stub
			return null;
		}
		
		
	}




}
