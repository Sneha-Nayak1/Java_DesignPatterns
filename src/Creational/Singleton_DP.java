package Creational;

public class Singleton_DP {
	
	public static void main(String[]  args) {
	Logger ab=Logger.getInstance();
	ab.info();
	ab.warning();
	ab.error();
	
	Logger abc=Logger.getInstance();
	abc.info();
	abc.warning();
	abc.error();
		
		
	}

}
