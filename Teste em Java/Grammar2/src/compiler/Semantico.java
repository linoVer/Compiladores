package compiler;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Semantico implements Constants {

	Stack<Integer> stack = new Stack<Integer>();
	Queue<Integer> fila = new LinkedList<Integer>();
	String y = new String();

	public int gerResult() {
		return Integer.valueOf(y);
	}

	public void executeAction(int action, Token token) throws SemanticError {

		Integer a, b, c = 0, result = 0;

		switch (action) {

		case 1:
			String tempsString = token.getLexeme();
			fila.add(Integer.valueOf(tempsString));
			stack.push(Integer.valueOf(tempsString));
			break;
		case 2:
			while(!fila.isEmpty()) 
			{
				y = y + fila.poll();
			}			
			break;
		case 3:
			while(!stack.isEmpty()) 
			{
				b = stack.pop();			
				if(b >= 8){
					throw new SemanticError("Not in the range", token.getPosition());
				}else{
		    		a = (int) Math.pow(8, c);
		    		a = a * b;		    		
		    		result = result + a;
		    		c++;
				}
			}    		   		
			y = result.toString();			
			break;
//		case 4:
//			break;
//		case 5:
//			break;
//		case 6:
//			break;
		
		}
	}
}
