package Creational;

public class Logger {
	static  Logger logg;
	  private Logger(){
			System.out.println("Sneha");
		}
	  
	
	public static  synchronized Logger getInstance() {
		if(logg==null) {
			 logg=new Logger();
		}
		return logg;
	}
	
	public static void info() {
		System.out.println("Info");
	}
	
	public static void warning() {
		System.out.println("Warning");
	}
	
	public static void error() {
		System.out.println("Error");
	}
	

}
