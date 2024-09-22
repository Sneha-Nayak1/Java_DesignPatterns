package state_DP;

public class Red implements State{

	@Override
	public void change(Context c) {
		System.out.println("Vehicles should stop but pedistraints can go.");
		//c.setState(new Green());
	}

}
