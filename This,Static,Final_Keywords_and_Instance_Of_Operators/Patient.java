

public class Patient {
	
	  
	   private static String hospitalName;
	   private static int totalPatients = 0;
	   
	   
	   private final String patientID; 
	   
	   private String name;
	   private int age;
	   private String ailment;
	   
	 
	   public Patient(String name, int age, String ailment, String patientID) {
	       this.name = name;
	       this.age = age;
	       this.ailment = ailment;
	       this.patientID = patientID;
	       totalPatients++;
	   }
	   
	   
	   public static void setHospitalName(String name) {
	       hospitalName = name;
	   }
	   
	  
	   public static int getTotalPatients() {
	       return totalPatients;
	   }
	   
	  
	   public void displayPatientDetails() {
	       if (this instanceof Patient) {
	           System.out.println("Hospital Name: " + hospitalName);
	           System.out.println("Patient ID: " + patientID);
	           System.out.println("Name: " + name);
	           System.out.println("Age: " + age);
	           System.out.println("Ailment: " + ailment);
	       } else {
	           System.out.println("The object is not an instance of the Patient class");
	       }
	   }
	   
	   
	   public String getName() {
	       return name;
	   }
	   public int getAge() {
	       return age;
	   }
	   public String getAilment() {
	       return ailment;
	   }
	   public String getPatientID() {
	       return patientID;
	   }
	   
	  
	   public static void main(String[] args) {
	       
	       Patient.setHospitalName("Max Hospital");
	       
	       Patient patient1 = new Patient("Ravi", 30, "Fever", "P1");
	       Patient patient2 = new Patient("Raju", 45, "Fracture", "P2");
	       
	       System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
	       
	       patient1.displayPatientDetails();
	       System.out.println();
	       patient2.displayPatientDetails();
	   }
	}

