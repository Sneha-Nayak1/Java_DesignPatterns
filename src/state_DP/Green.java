package state_DP;

public class Green implements State{

	@Override
	public void change(Context c) {
		System.out.println("Vehicles can go but pedistraints should wait.");
		//c.setState(new Yellow());
	}

}
