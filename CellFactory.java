package classDomain3cleancode;

public class CellFactory {
	public static boolean isNumeric(String strNum) {
	    return strNum.matches("-?\\d+(\\.\\d+)?");
	}
	public static Cell CreateCell(Sheet sheet,String str, int xpos, int ypos) {
        Cell cell=new Cell( xpos, ypos);
        cell.setSheet(sheet);
		if(isNumeric(str)) {
			Content content=new Numeric(Float.parseFloat(str));
          cell.setContent(content);
          content.setCell(cell);
			return cell;
			}
		
		else if(str.contains("+") || str.contains("-")||str.contains("*")||str.contains("/")) {
			Content content=new Expression(str);
			cell.setContent(content);
			content.setCell(cell);
			return cell;
			}
		else if(str.contains("[") && str.contains(",") && str.contains("]")) {
			Content content=new Reference(str);
			cell.setContent(content);
			content.setCell(cell);
			content.compute();
			return cell;
		}
		else {
			Content content=new StringVal(str);			
			cell.setContent(content);
			content.setCell(cell);

			return cell;
		}
	}
}
