

public class Vehicle {
	
	  
	   private static double registrationFee = 1000.0; 
	   
	 
	   private final String registrationNumber;
	   
	   private String ownerName;
	   private String vehicleType;
	   
	   
	   public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
	       this.ownerName = ownerName;
	       this.vehicleType = vehicleType;
	       this.registrationNumber = registrationNumber;
	   }
	   
	   public static void updateRegistrationFee(double newFee) {
	       if (newFee >= 0.0) {
	           registrationFee = newFee;
	       } else {
	           System.out.println("Invalid registration fee. Enter a valid fee ");
	       }
	   }
	   
	  
	   public void displayRegistrationDetails() {
	       if (this instanceof Vehicle) {
	           System.out.println("Owner Name: " + ownerName);
	           System.out.println("Vehicle Type: " + vehicleType);
	           System.out.println("Registration Number: " + registrationNumber);
	           System.out.println("Registration Fee: Rs" + registrationFee);
	       } else {
	           System.out.println("The object is not an instance of the Vehicle class");
	       }
	   }
	   
	   
	   public String getOwnerName() {
	       return ownerName;
	   }
	   public String getVehicleType() {
	       return vehicleType;
	   }
	   public String getRegistrationNumber() {
	       return registrationNumber;
	   }
	   
	   
	   public static void main(String[] args) {
	       
	       Vehicle.updateRegistrationFee(1500.0); 
	       
	       Vehicle vehicle1 = new Vehicle("Ravi Singh", "Scorpio", "12345");
	       Vehicle vehicle2 = new Vehicle("Rohit Sharma", "Thar", "67890");
	       
	       vehicle1.displayRegistrationDetails();
	       System.out.println();
	       vehicle2.displayRegistrationDetails();
	   }
	}

