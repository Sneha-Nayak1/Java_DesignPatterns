package template_DP;

public abstract class DataProcessor {
	public void process() {
		 reading();
		 parsing();
		 saving(); 
	}
	abstract void reading();
	abstract void parsing();
	abstract void saving();
}
