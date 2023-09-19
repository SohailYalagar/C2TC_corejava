
public class ConstructorDemo {

	public static void main(String[] args) {
	Customer c = new Customer(); //Object creation
	
	//value initialization
	//c.customerId=1;
	c.setCustomerId(1);
	//c.customerName="Sohail"
	c.setCustomerName("Sohail");
	//c.customerCity="Bagalkot";
	c.setCustomerCity("Bagalkot");
	System.out.println(c.getCustomerId() + " " + c.getCustomerName() +" "+c.getCustomerCity());
	
	}
	
}
