package interpreter_DP;

public class Division implements AbstractExpression{
	AbstractExpression left;
	AbstractExpression right;
	

	public Division(AbstractExpression left, AbstractExpression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int interpret(Context context) {
		return left.interpret(context) / right.interpret(context);
	}

}
