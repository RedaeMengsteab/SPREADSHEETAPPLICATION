package classDomain3cleancode;

public class Subtract implements BinaryOperator {

	
private char getCharacter;

public Subtract(char tokens) {
	this.getCharacter = tokens;
	
}
public char getGetCharacter() {
	return getCharacter;
}
public void setGetCharacter(char getCharacter) {
	this.getCharacter = getCharacter;
}
	@Override
	public String evaluate(Content left,Content right) {
		return String.valueOf(Float.parseFloat(left.getcontent()) - Float.parseFloat(right.getcontent()));
	}

}
