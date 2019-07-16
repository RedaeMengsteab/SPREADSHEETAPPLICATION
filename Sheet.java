package classDomain3cleancode;

import java.util.LinkedHashMap;
import java.util.Map;

public class Sheet {
	private String fileName;
	private int row;
	private int column;
	private Map<Position,Cell> cells=new LinkedHashMap<>();
	
	
	public Sheet(String fileName, int row, int column) {
	
		this.fileName = fileName;
		this.row = row;
		this.column = column;
	}


	public void addCell(String value,int row,int col) {
		Cell cell=CellFactory.CreateCell(this,value,row,col);
		if(cell.getXpos()>this.row)
			this.row=cell.getXpos()+1;
		if(cell.getYpos()>this.column)
			this.column=cell.getYpos()+1;
		cells.put(new Position(cell.getXpos(), cell.getYpos()),cell);
		cell.setSheet(this);
	//	cell.assign();
	}
	public void clearCell() {
		//
	}
	public void displaySheet() {
		System.out.println(String.format("%s","----------------------------------------------------------------------------------------------------------------------------------------------------------------"));
		for(int i=0;i<=row;i++) {
			for(int j=0;j<=column;j++) {
				if(cells.get(new Position(i,j))!=null) {
				System.out.print(String.format("%-28s %-10s",cells.get(new Position(i,j)).getContent().getcontent(),"|" ));
				}else
				System.out.print("\t");
				}
			System.out.println();
					
			}
		System.out.print(String.format("%s","----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"));
	
	}
	public void displayAll() {
		System.out.println();
		System.out.println();
		for(Position po:cells.keySet()) {
			System.out.println("[" +po.getRow() +","+po.getColumn()+"]="+cells.get(po).getContent().getcontent()+"--->"+cells.get(po).getContent().getStringVal());
		}
		
	}

	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getRow() {
		return row;
	}


	public void setRow(int row) {
		this.row = row;
	}


	public int getColumn() {
		return column;
	}


	public void setColumn(int column) {
		this.column = column;
	}


	public Map<Position, Cell> getCells() {
		return cells;
	}


	public void setCells(Map<Position, Cell> cells) {
		this.cells = cells;
	}


	
	
	

}
