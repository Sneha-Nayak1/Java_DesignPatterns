package stratergy_DP;

public class Context {
	Payment p;
	public Context(Payment p) {
		this.p=p;
	}
	
	public void pay() {
		p.paymentMethod();
	}

}
