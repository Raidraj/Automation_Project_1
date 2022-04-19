package Java_coding;

public class Vehicle {
public static int numberOfwheels = 4;
	
	public static String BrandName = "BMW", Color;
	double price = 5076.50;
			
	        void start() {
			String keytype = "Button";
			System.out.println("Car is ready to Start--" + keytype + -numberOfwheels+ price);
			};
			
			void changeGear() {
				String geartype = "Automatic Transmission";
			System.out.println("Shift From Parking to Drive" + geartype +price);	
			}
		
		static int accelerate()		{
		int speed = 100;
		return speed;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
numberOfwheels = 4;
BrandName = "BMW";
Vehicle BMW = new Vehicle();
BMW.start(); 
BMW.changeGear();
Vehicle.accelerate();
System.out.println("Car Speed is" + Vehicle.accelerate()+ "mph");
System.out.println("the price of car is "+ BMW.price / numberOfwheels);
	}
}
