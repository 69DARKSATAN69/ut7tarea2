import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacturaTest {

																//Segunda clase de test, fartura modificada.
	@Test
	void iva021Test() {
		Invoice fact = new Invoice(120);
		fact.iva021();
		assertTrue(fact.getTotalPrice() == 145.2);
	}

	
	@Test
	void iva004Test() {
		Invoice fact = new Invoice(120);
		fact.iva004();
		assertTrue(fact.getTotalPrice() == 124.8);
	}
	

	@Test
	void descuentoVipTest() {
		Invoice fact = new Invoice(120);
		fact.iva021();
		fact.descuentoVIP();
		assertEquals(130.68, fact.getTotalPrice(), 0.01);
	}

}
