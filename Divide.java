package classDomain3cleancode;

public class Divide implements BinaryOperator {

private char getCharacter;
	
	public Divide(char tokens) {
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
		return String.valueOf(Float.parseFloat(left.getcontent()) / Float.parseFloat(right.getcontent()));
	}

}
