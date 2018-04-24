import java.util.ArrayList;
import java.util.List;



public class Address extends Contact{

	private String street;
	private String houseNumber;
	private String zipCode;
	private String city;
	
	//static List<Contact> list=new ArrayList<>();
	
	//Customer customer = new Customer();

	//customer.
	//customer
	
	//list.add(customer);

	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
