package stratergy_DP;

public class Main {

	public static void main(String[] args) {
		Context c1=new Context(new CreditCard());
		c1.pay();
		
		Context c2=new Context(new PayPal());
		c2.pay();
		
		Context c3=new Context(new Bitcoin());
		c3.pay();

	}

}
/*Design a payment system where users can pay by different methods 
 * (e.g., Credit Card, PayPal, Bitcoin). Each payment method will be a separate strategy.
1. Strategy Interface: This interface will declare a method for processing payments.
2. Strategies: Each concrete strategy will implement the payment processing in its own way.
3. Context Class: This class will use a strategy to process payments. It allows changing the payment method at runtime.
4. Main: Demonstrate payment processing by different modes.*/