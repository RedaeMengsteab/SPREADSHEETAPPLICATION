package classDomain3cleancode;

public class Numeric extends Content{

	private Float numValue;
	private String stringVal;
	
	
	public Numeric(Float numValue) {
		super();
		this.numValue = numValue;
		this.stringVal=String.valueOf(numValue);
	}

	public Float getNumValue() {
		return numValue;
	}

	public void setNumValue(Float numValue) {
		this.numValue = numValue;
	}

	@Override
	public String getcontent() {
		
		return String.valueOf(numValue);
	}
	@Override
	public String getStringVal() {
		
		return this.stringVal;
	}

}
