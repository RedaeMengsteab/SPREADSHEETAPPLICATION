package classDomain3cleancode;

public abstract class Content {
	private Cell cell;
	
public Cell getCell() {
		return cell;
	}

	public void setCell(Cell cell) {
		this.cell = cell;
	}

public abstract String getcontent();
public abstract String getStringVal();

public void compute() {
	// Useful on reference and Expression sub classes
	
}
}
