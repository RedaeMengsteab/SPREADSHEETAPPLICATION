package ClassDomain3_3;

public class Subtract implements BinaryOperator {

	@Override
	public Float evaluate(Content left,Content right) {
		return Float.parseFloat(left.getcontent()) - Float.parseFloat(right.getcontent());
	}

}
