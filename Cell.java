package classDomain3cleancode;

public class Cell {
	private int xpos;
	private int ypos;	
	private Content content;
	private Sheet sheet;
	public Cell(String value, int xpos, int ypos) {
		this.xpos = xpos;
		this.ypos = ypos;
		content=ContentFactory.CreateContent(value);
	}

	public Cell(int xpos, int ypos) {
		this.xpos = xpos;
		this.ypos = ypos;
	}

	public int getXpos() {
		return xpos;
	}

	public void setXpos(int xpos) {
		this.xpos = xpos;
	}

	public int getYpos() {
		return ypos;
	}

	public void setYpos(int ypos) {
		this.ypos = ypos;
	}
	

	public void setActualValue(String str) {
		// TODO Auto-generated method stub
		
	}

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public Sheet getSheet() {
		return sheet;
	}

	public void setSheet(Sheet sheet) {
		this.sheet = sheet;
	}
	
//	public void assign() {
//		content.setCell(this);
//		content.compute();
//	}

}
