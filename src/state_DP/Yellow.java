package state_DP;

public class Yellow implements State{

	@Override
	public void change(Context c) {
		System.out.println("Vehicles should be ready.");	
		//c.setState(new Red());
	}

}
