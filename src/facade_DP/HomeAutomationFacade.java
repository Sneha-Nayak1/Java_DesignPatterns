package facade_DP;

public class HomeAutomationFacade {
	
	private Lighting l;
	private Heating h;
	private Security s;
	
	public HomeAutomationFacade() {
		this.l=new Lighting();
		this.h=new Heating();
		this.s=new Security();
	}
	
	public void enter() {
		l.on();
		h.isActive();
		s.noSecure();
	}
	
	public void exitt() {
		l.of();
		h.isInActive();
		s.isSecure();
	}
	
	

}
