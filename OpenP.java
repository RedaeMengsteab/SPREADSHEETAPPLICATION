package classDomain3cleancode;

public class OpenP implements BinaryOperator {

	private char getCharacter;
	
	public OpenP(char tokens) {
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
