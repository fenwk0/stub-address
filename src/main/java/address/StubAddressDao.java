package address;

public class StubAddressDao implements AddressDao {

	private final Address address;

	public StubAddressDao(Address address) {
		this.address = address;
	}

	// Simply returns the address that the stub was built with.
	// NO LOGIC, hence no unit test required to test the stub.
	public Address findAddress(int id) {
		return address;
	}
}