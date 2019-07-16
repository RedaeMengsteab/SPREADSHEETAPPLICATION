package classDomain3cleancode;;

public interface BinaryOperator {
	public char getGetCharacter();
public String evaluate(Content left,Content right);
public static BinaryOperator createBi(char c) {
	switch (c) 
    { 
    case '+': 
        return new Sum(c); 
    case '-': 
        return new Subtract(c); 
    case '*': 
        return new Multiply(c); 
    case '/': 
        
        return new Divide(c); 
    } 
    return null; 
}


//Returns true if 'op2' has higher or same precedence as 'op1', 
// otherwise returns false. 
public static boolean hasPrecedence(char op1, char op2) 
{ 
    if (op2 == '(' || op2 == ')') 
        return false; 
    if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) 
        return false; 
    else
        return true; 
} 
}
