package ClassDomain3_3;

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

}
