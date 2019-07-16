package classDomain3cleancode;

import java.util.Stack;

public class Expression extends Content {

	private String expression;
	private String stringVal;
	  
    // Stack for numbers: 'values' 
   Stack<Content> values = new Stack<>(); 

   // Stack for Operators: 'ops' 
   Stack<BinaryOperator> ops = new Stack<BinaryOperator>();

   public String evaluate() {
	  // char[] tokens = parse(expression).toCharArray();
	   char[] tokens = expression.toCharArray();
	   for (int i = 0; i < tokens.length; i++) 
       { 
            // Current token is a whitespace, skip it 
           if (tokens[i] == ' ') 
               continue; 
       
           // Current token is a number, push it to stack for number  
           if (tokens[i] >= '0' && tokens[i] <= '9'||tokens[i] == '.') 
           { 
               StringBuffer sbuf = new StringBuffer(); 
               // There may be more than one digits in number 
               while (i < tokens.length && ( tokens[i] >= '0' && tokens[i] <= '9'||tokens[i] == '.') )          		   
                   sbuf.append(tokens[i++]); 
                  --i;
               values.push(ContentFactory.CreateContent(sbuf.toString(),this.getCell())); 
           } 
       
       
        // Current token is a number, push it to stack for references 
           else   if (tokens[i] == '[' || tokens[i] == ']'||tokens[i] == ',') 
           { 
               StringBuffer sbuf = new StringBuffer(); 
               // There may be more than one digits in number 
               while (i < tokens.length && ( tokens[i] >= '0' && tokens[i] <= '9'||tokens[i] == '[' || tokens[i] == ']'||tokens[i] == ',' )) 
                   sbuf.append(tokens[i++]);
                   --i;// save the next token from being skipped
               values.push(getPval(sbuf.toString())); 
           }
        // Current token is an opening brace, push it to 'ops' 
           else if (tokens[i] == '(') 
               ops.push(new OpenP(tokens[i])); 
 
           // Closing brace encountered, solve entire brace 
           else if (tokens[i] == ')') 
           { 
               while (ops.peek().getGetCharacter() != '(') 
                 values.push(ContentFactory.CreateContent(ops.pop().evaluate(values.pop(), values.pop()))); 
               ops.pop(); 
           } 
        // Current token is an operator. 
           else if (tokens[i] == '+' || tokens[i] == '-' || 
                    tokens[i] == '*' || tokens[i] == '/') 
           { 
               // While top of 'ops' has same or greater precedence to current 
               // token, which is an operator. Apply operator on top of 'ops' 
               // to top two elements in values stack 
               while (!ops.empty() && BinaryOperator.hasPrecedence(tokens[i], ops.peek().getGetCharacter())) 
                 values.push(ContentFactory.CreateContent(ops.pop().evaluate(values.pop(), values.pop()))); 
 
               // Push current token to 'ops'. 
               ops.push(BinaryOperator.createBi(tokens[i])); 
           }      
       }
	// Entire expression has been parsed at this point, apply remaining 
       // ops to remaining values 
       while (!ops.empty()) 
           values.push(ContentFactory.CreateContent(ops.pop().evaluate(values.pop(), values.pop()))); 
 
       // Top of 'values' contains result, return it 
       return values.pop().getcontent();
	
   }
   
 
	public Expression(String expression) {
		super();
		this.expression = expression;
		this.stringVal=expression;
	}

	public String getExpretion() {
		return expression;
	}

	@Override
	public String getcontent() {
		return evaluate();
		//return putSpace(parse(expression));
	}

	@Override
	public String getStringVal() {
		
		return this.stringVal;
	}
	
	private Content getPval(String ref) {
		int xpos,ypos;
		int indexOFComa=ref.indexOf(',');
		int indexOfClose=ref.indexOf(']');
		xpos=Integer.parseInt(ref.substring(1, indexOFComa));
		ypos=Integer.parseInt(ref.substring(indexOFComa+1, indexOfClose));
	
		Position pos=new Position(xpos,ypos);
		Cell cell=this.getCell().getSheet().getCells().get(pos);
		return cell.getContent();
	}
	

}
