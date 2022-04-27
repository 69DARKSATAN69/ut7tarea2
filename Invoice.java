
/**
 * Clase para hacer facturas y aplicar iva
 * @author Programador Bajeril
 *
 */
public class Invoice {
	private double totalPrice;
	private double subtotalPrice;
	
	public Invoice (double subtotal) {
		subtotalPrice = subtotal;
	}
	
	/**
	 *  applies standard vat rate to the subtotal price and stores the result in the totalPrice variable.
	 */
	public void iva021 () {
		totalPrice = subtotalPrice + (subtotalPrice * 0.21d);
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getSubtotalPrice() {
		return subtotalPrice;
	}

	public void setSubtotalPrice(double subtotalPrice) {
		this.subtotalPrice = subtotalPrice;
	}

	/**
	 *  applies the reduced vat rate to the subtotal price and stores the result in the totalPrice variable.
	 */
	public void iva004 () {
		totalPrice = subtotalPrice + (subtotalPrice * 0.04d);		
	}
	
	/**
	 * applies a fixed discount to the invoice's total price (after vat) to vip clients.
	 */
	public void descuentoVIP () {
		totalPrice -= (totalPrice * 0.10d);
	}

}
