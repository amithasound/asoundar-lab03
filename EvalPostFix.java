import java.util.Scanner;

public class EvalPostFix {

	 static Stack<Integer> myStack = new ArrayStack<Integer>();
	 static Stack<String> stackOne = new ArrayStack<String>();
	 
	 
	 public static void main (String []args) {
		 
		//System.out.println(duplicateRemoval("abccad"));
		System.out.println(eval("4 2 + 3 5 1 - * +"));
		
	 }
	 
	 
	 
	 
	  
	public static int apply(char oper, int arg1, int arg2) {
		int result = 0; 
	switch(oper){
		case '+' : 
			result = arg1 + arg2;
			return result;
		case '-':
			result = arg1 - arg2;
			return result;
      case '/':
      	result = arg1 / arg2;
      	return result;
      case '*':
      	result = arg1 / arg2;
      	return result;
      default:
      	return result;
       
	     }
	}

	
	public static int eval(String postFix){
		Scanner kb = new Scanner(postFix);  
		String operator;
		int int2;
		int int1;
		int result = 0; 
		while(kb.hasNext()) {

		      if(kb.hasNextInt()) {
		    	  
		    	  Integer i=Integer.valueOf(kb.next());  
		    	  myStack.push(i);
		    	  
		      }else {
		    	operator = kb.next();
		    	 
		        int2 = myStack.pop();
		  		int1 = myStack.pop();
		  		
		  		
		  		
		  		switch(operator){
				case "+": 
					result = int1 + int2 ;
					myStack.push(result);
					break;
					
				case "-":
					result = int1 - int2;
					myStack.push(result);
					break;
					
		        case "/":
		        	result = int1 / int2;
		        	myStack.push(result);
		        	break;
		        	
		        case "*":
		        	result = int1 * int2;
		        	myStack.push(result);
		        	break;
		        default:
		        	return result;
		         
			     }
		  		 
		  		
		      }
		     
		      
		}
		result = myStack.peek();
	    return result;
		
		
	}//end of the method
	
	
	
	public static String duplicateRemoval(String dupString) {
	 String temp = "";
	 String temporary = "";
	 String beforeReverse = "";
	 String finalString="";
     char ch;
     
	     
		 for(int i = 0; i< dupString.length(); i++){
				   
			   char index = dupString.charAt(i); 
			   temp = String.valueOf(index);   
				 if(stackOne.isEmpty()) {
					 stackOne.push(temp);
					 
				 }else if(stackOne.peek().equals(temp)) {
					 stackOne.pop();
					 
					 
				 }else{
					 stackOne.push(temp);
					 
				 }
			
		  }
	 		
	 		
	 		while(!stackOne.isEmpty()){
	 		   temp = stackOne.pop();
	 		   beforeReverse += temp;
	 		}
	 		
	        
	 		 for (int i=0; i<beforeReverse.length(); i++){
	 	       ch= beforeReverse.charAt(i); //extracts each character
	 	       finalString= ch+finalString; //adds each character in front of the existing string
	 	      }
	 	      
	 	    
	
			return finalString;
	}
	

	
	
	
	
	
	
	
	
	
	
}
