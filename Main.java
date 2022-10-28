 import java.util.Scanner;
     
     public class Main {
     	public static void main(String[] args) {
     		Scanner sc = new Scanner (System.in);
     		System.out.println("Enter the customer name");
     		String name=sc.next();
     		System.out.println("Enter the phone number");
     		String phone=sc.next();
    		System.out.println("Enter the street name");
    		String street=sc.next();
    		System.out.println("Enter the bill amount");
    		double bill=sc.nextDouble();
    		System.out.println("Enter the distance");
    		int distance=sc.nextInt();
    		CustomerDetails c= new CustomerDetails(name,phone,street,bill,distance);
    		System.out.println("Customer name"+c.getCustomerName());
    		System.out.println("Phone number "+ c.getPhoneNumber());
    		System.out.println("Street name "+c.getStreetName());
    		System.out.println("Bonus points "+c.calculateBonusPoints());
    		System.out.println("Delivery charge"+c.deliveryCharge());
    	}
    }
