package address;

public class AddressService {

	  private AddressDao addressDao;

	  /**
	   * Given an id, retrieve an address. Apply pretend business rules.
	   *
	   * @param id
	   *            The id of the address object.
	   */
	  public Address findAddress(int id) {

	    System.out.println("In Address Service with id: " + id);
	    Address address = addressDao.findAddress(id);

	    address = businessMethod(address);

	    System.out.println("Leaving Address Service with id: " + id);
	    return address;
	  }

	  private Address businessMethod(Address address) {

	    System.out.println("in business method");

	    // Apply the Special Case Pattern (See MartinFowler.com)
	    if (isNull(address)) {
	      address = Address.INVALID_ADDRESS;
	    }

	   // Do some pretend business processing herer ...

	    return address;
	  }

	  private boolean isNull(Object obj) {
	    return obj == null;
	  }

	  public void setAddressDao(AddressDao addressDao) {
	    this.addressDao = addressDao;
	  }
}
