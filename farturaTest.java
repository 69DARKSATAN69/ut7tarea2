import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class farturaTest {

								//Primera clase de testeo, fartura sin modificar.

	@Test
	void ivareduTest() {
		Invoice fart = new Invoice(120);
		fart.iva021();
		assertTrue(fart.totalPrecio==145.2);
	}
	
	@Test
	void ivaTest() {
		Invoice fart = new Invoice(120);
		fart.iva004();
		assertTrue(fart.totalPrecio == 124.8);
	}

	
	
	@Test
	void descuentoesp() {
		Invoice fart = new Invoice(120);
		fart.descuentoVIP();
		assertTrue(fart.totalPrecio == 108);
	}
}
