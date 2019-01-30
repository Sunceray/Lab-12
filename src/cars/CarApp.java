package cars; //package

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.NEW;

import cars.cars.Car;

public class CarApp {
	
	private static List<Car> cars = new ArrayList<>();
	
	static boolean finished = false;

	static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {
		
		UsedCar  = usedCars("Mercedes", "G Class", 2019, 124000.00);
		cars.add(g class);
		
		UsedCar ls = new usedCar("Lexus", "LS", 2018, 70000.00);
		cars.add(ls);
		
		UsedCar leBaron = new usedCar("Maserati", "Levante", 2019, 70000.00);
		cars.add(levante);
		
		Car tesla = new usedCar("Tesla", "Model 6", 2018, 70000.00);
		cars.add(model 6);
		
		Car f150 = new usedCar("BMW", "x5", 2019, 50000.00);
		cars.add(x5);
		
		Car ghibli = new usedCar("Porsche", "911", 2019, 85000.00);
		cars.add(ghibli);
		
		Car blank = new Car();
		cars.add(blank);
		
		System.out.println(
				"Welcome to the STP Administrative Application!");
		
		String String;
		 toString()  {

	        return "The ake of your car is" + getMake() + ", model of the car is " + getModel() + ", and year of the car is " + getYear;
	        
	    }
		 
	String option = read.nextLine();
	            switch (option) {
	            
	            }
	            case "list":
	            case "1":
	                list();
	                break;
	            case "add":
	            case "2":
	                System.out.println("\n\nIs the car you want to add new or used? {\"new\"/\"used\")");
	                option = read.nextLine();
	                switch (option) { //I would use a different variable here so you don’t run into an issue where the program doesn’t ask for option because option already has a value
	                case "new":
	                    addCar(Car.size());
	                    break;
	                case "used":
	                    addUsed(cars.size());
	                    break;
	                default:
	                    System.out.println("Sorry, that input wasn't valid. Back to the main menu.");
	                    break;
	                }
	                break;
	do {
	            finished = false;
	            try {
	                double price = read.nextDouble();
	                read.nextLine(); //Clearing scanner correct?
	                finished = true;
	            } catch (InputMismatchException ex) {
	                System.out.println("Sorry, that's not a valid price. Please enter a number without a \"$\".");
	                read.nextLine();
	            }
	        } while (!finished);

	            }

	private static Object newCar(String string, String string2, int i, double d) {
		
		return null;
	}

	private static void list() {
		
		
	}
	}   

	
