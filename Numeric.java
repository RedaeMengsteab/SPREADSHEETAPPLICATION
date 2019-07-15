package ClassDomain3_3;

public class Numeric extends Content{

	private Float numValue;
	
	public Numeric(Float numValue) {
		super();
		this.numValue = numValue;
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

}
