package car_dealership;

public class Dealership {
	
	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		cust1.setName("Tom");
		cust1.setAddress("123 Anything St.");
		cust1.setCashOnHand(25000);
		
		Vehicle vehicle = new Vehicle("BMW","M3",20000);
		
		
		Employee emp = new Employee();
		
		cust1.purchaseCar(vehicle, emp, false);
		
		Vehicle car = new Vehicle("BMW","M3",20000);
		
		boolean value = car.equals(vehicle);
		System.out.println(value);
		
		
		/**
		 * 
		 * handleCustomer(Customer cust, boolean finance, Vehicle vehicle)
		 * if(finance == true)
		 * 		runCrediteHistory(Customer cust, double doubleAmount)
		 * else if (vihicle.getPrice() <= cust.cashOnHand):
		 * 		processTransaction(Customer cust, Vehicle vehicle)
		 * else:
		 * 		tell customer to bring more money
		 * 
		 */
	}

}
