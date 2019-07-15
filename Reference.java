package ClassDomain3_3;

public class Reference extends Content{

	private String stringVal;
	private Cell cell;
	
	public Reference(String string) {
		this.stringVal=string;
	}
	
	public String getStringVal() {
		return stringVal;
	}

	public void setStringVal(String stringVal) {
		this.stringVal = stringVal;
	}

	public Reference(Cell reference) {
		super();
		this.cell = reference;
	}

	public Cell getReference() {
		return cell;
	}

	public void setReference(Cell reference) {
		this.cell = reference;
	}

	@Override
	public String getcontent() {
		return cell.getContent().getcontent();
	}

	private Cell getPval() {
		int xpos,ypos;
		int indexOFComa=stringVal.indexOf(',');
		int indexOfClose=stringVal.indexOf(']');
		xpos=Integer.parseInt(stringVal.substring(1, indexOFComa));
		ypos=Integer.parseInt(stringVal.substring(indexOFComa+1, indexOfClose));
	
		Position pos=new Position(xpos,ypos);
		Cell cell=this.getCell().getSheet().getCells().get(pos);
		return cell;
	}
	public void compute() {
		cell=getPval();
		
	}
}
