package classDomain3cleancode;

public class CloseP implements BinaryOperator {

private char getCharacter;
	
	public CloseP(char tokens) {
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
		return null;
	}

}
