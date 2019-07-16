package classDomain3cleancode;



public class ContentFactory {
	
	public static boolean isNumeric(String strNum) {
	    return strNum.matches("-?\\d+(\\.\\d+)?");
	}

	public static Content CreateContent(String str) {

		if(isNumeric(str)) {
			Content content=new Numeric(Float.parseFloat(str));

			return content;
			}
		
		else if(str.contains("+") || str.contains("-")||str.contains("*")||str.contains("/")) {
			Content content=new Expression(str);
			return content;
			}
		else if(str.contains("[") && str.contains(",") && str.contains("]")) {
			Content content=new Reference(str);
			return content;
		}
		else {
			Content content=new StringVal(str);			
	        return content;
		}
	}
	
	public static Cell CreateCell(String str, int xpos, int ypos) {
          Cell cell=new Cell( xpos, ypos);
		if(isNumeric(str)) {
			Content content=new Numeric(Float.parseFloat(str));
            cell.setContent(content);
			return cell;
			}
		
		else if(str.contains("+") || str.contains("-")||str.contains("*")||str.contains("/")) {
			Content content=new Expression(str);
			cell.setContent(content);
			return cell;
			}
		else if(str.contains("[") && str.contains(",") && str.contains("]")) {
			Content content=new Reference(str);
			cell.setContent(content);
			content.compute();
			return cell;
		}
		else {
			Content content=new StringVal(str);			
			cell.setContent(content);
			return cell;
		}
	}
	
	
	public static Content CreateContent(String str,Cell cell) {

		if(isNumeric(str)) {
			Content content=new Numeric(Float.parseFloat(str));
			content.setCell(cell);
			content.compute();
			return content;
			}
		
		else if(str.contains("+") || str.contains("-")||str.contains("*")||str.contains("/")) {
			Content content=new Expression(str);
			content.setCell(cell);
			content.compute();
			return content;
			}
		else if(str.contains("[") && str.contains(",") && str.contains("]")) {
			Content content=new Reference(str);
			content.setCell(cell);
			content.compute();
			return content;
		}
		else {
			Content content=new StringVal(str);
			content.setCell(cell);
			content.compute();
	        return content;
		}
	}


}
