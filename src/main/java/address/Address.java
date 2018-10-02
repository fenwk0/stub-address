package address;

public class Address {
	
	public static final Address INVALID_ADDRESS = null;
	int id;
	String street;
	String town;
	String postCode;
	String country;
	
	public Address(int id, String street, String town, String postCode,
			String country) {
		this.id = id;
		this.street = street;
		this.town = town;
		this.postCode = postCode;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getPostCode() {
		return postCode;
	}
	
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
}
