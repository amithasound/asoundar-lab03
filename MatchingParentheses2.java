public class MatchingParentheses2 {

    private String expression;
    private Stack<Character> stack;
    private String closeset;
    private String openset;

    // Sets up the stack for matching parentheses in the expression.
    public MatchingParentheses2(String expression, String openset, String closeset) {
        this.expression = expression;
        this.stack = new ArrayStack<Character>();
        this.openset = openset;
        this.closeset = closeset;
    }

    // Checks the expression for matching parentheses.
    public MatchState check() {
        for (int i = 0; i < expression.length(); i++) {
            Character paren = expression.charAt(i);
            
            
        if (!checkParen(paren))
                return MatchState.MISSING_LEFT;
        }
        if (stack.isEmpty())
            return MatchState.BALANCED;
        else
            return MatchState.MISSING_RIGHT;
    }

    // Checks the current character using a stack to match left
    // and right parentheses. Ignores non-parenthesis characters.
    // Returns true if match is found, false otherwise.
    private boolean checkParen(Character ch) {
    	
    	
    	int openIndex, closeIndex;
    	
    	//String openset = "";
    	//String closeset = "";
    	
    	/*
    	 for (int i = 0; i < expression.length(); i++) {
              symbol = expression.charAt(i);
             if(symbol == '(' || symbol == '{' ||symbol == '[') {
            	 openset += symbol;
             }
             else if(symbol == ')' || symbol == '}' ||symbol == ']') {
            	 closeset += symbol;
             }
    	 }    
    	 */
    	 
    	openIndex = openset.indexOf(ch);
    	closeIndex = closeset.indexOf(ch);
    	
        if (openIndex != -1) { 
            stack.push(ch);
        }else if (closeIndex != -1 && (stack.isEmpty() || stack.pop() != openset.charAt(closeIndex))) { 
            return false;
        }  
        
        
        return true;
        
       
       
       
    }
}
    
