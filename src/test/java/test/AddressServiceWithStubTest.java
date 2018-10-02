package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import address.Address;
import address.AddressService;
import address.StubAddressDao;

public class AddressServiceWithStubTest {

    private AddressService instance;

    @Before
    public void setUp() throws Exception {
        System.out.println("Before called.");
        instance = new AddressService();
    }

    @Test
    public void testFindAddressWithStub() {

        /*
         * A 'real' test would use an implementation of the
         * AddressDao e.g.
         *
         * public void JDBCAddress implements AddressDao { ...
         *
         * , then use: instance.setAddressDao(new JDBCAddress());
         *
         * , and test using 'real' data, but that would constitute an
         * integration test
         */

        /* Setup the test data - stuff that's specific to this test */
        Address expectedAddress = new Address(1, "15 My Street", "My Town",
                "POSTCODE", "My Country");
        instance.setAddressDao(new StubAddressDao(expectedAddress));

        /* Run the test */
        Address result = instance.findAddress(1);

        /* Assert the results */
        assertEquals(expectedAddress.getId(), result.getId());
        assertEquals(expectedAddress.getStreet(), result.getStreet());
        assertEquals(expectedAddress.getTown(), result.getTown());
        assertEquals(expectedAddress.getPostCode(), result.getPostCode());
        assertEquals(expectedAddress.getCountry(), result.getCountry());
    }
}