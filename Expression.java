package ClassDomain3_3;

public class Expression extends Content {

	private String expression;
	
	private Content left;
	private BinaryOperator operator;
	private Content right;
	
	
	public Expression(String expression) {
		super();
		this.expression = expression;
	}

	public String getExpretion() {
		return expression;
	}

	public void setExpretion(String expression) {
		this.expression = expression;
	}

	@Override
	public String getcontent() {
		return String.valueOf(operator.evaluate(left, right));
	}
	
	@Override
	public void compute() {
		// TODO Auto-generated method stub
		if(expression.contains("+")) {
			operator=new Sum();
			foFor('+');
		}
		else if(expression.contains("-")) {
			operator=new Subtract();
			foFor('-');
		}
		else if(expression.contains("*")) {
			operator=new Multiply();
			foFor('*');
		}
		if(expression.contains("/")) {
			operator=new Divide();
			foFor('/');
		}
		
		
	}

	private void foFor(char ch) {

		int indexOf=expression.indexOf(ch);
		left=ContentFactory.CreateContent(expression.substring(0,indexOf));
		left.setCell(getCell());
		left.compute();
		right=ContentFactory.CreateContent(expression.substring(indexOf+1,expression.length()));
		right.setCell(getCell());
		right.compute();
	}

}
