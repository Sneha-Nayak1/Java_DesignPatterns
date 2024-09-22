package interpreter_DP;

public class Multiplication implements AbstractExpression{
	AbstractExpression left;
	AbstractExpression right;
	

	public Multiplication(AbstractExpression left, AbstractExpression right) {
		this.left = left;
		this.right = right;
	}
	

	@Override
	public int interpret(Context context) {
		return left.interpret(context) * right.interpret(context);
	}

}
