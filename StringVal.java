package classDomain3cleancode;

public class StringVal extends Content{

	private String stringvalue;

	
	public StringVal(String stringvalue) {
		super();
		this.stringvalue = stringvalue;
	}

	public String getStringvalue() {
		return stringvalue;
	}

	public void setStringvalue(String stringvalue) {
		this.stringvalue = stringvalue;
	}

	@Override
	public String getcontent() {
		// TODO Auto-generated method stub
		return stringvalue;
	}

	@Override
	public String getStringVal() {
		// TODO Auto-generated method stub
		return stringvalue;
	}
	
}
