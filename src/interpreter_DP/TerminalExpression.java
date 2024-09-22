package interpreter_DP;

public class TerminalExpression implements AbstractExpression{
	
	int number;
	public TerminalExpression(int number) {
		this.number = number;
	}
	
	@Override
	public int interpret(Context context) {
		return number;
	}

}
