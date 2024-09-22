package momento_DP;

import java.util.ArrayList;
import java.util.List;

public class Memonto {
	private final List<String> state;
	
	public Memonto(List<String> state) {
		this.state=List.copyOf(state);
	}
	
	public List<String> getState() {
		return state;
	}

}
