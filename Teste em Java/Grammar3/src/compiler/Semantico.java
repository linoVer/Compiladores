package compiler;

import java.util.Stack;
import java.util.TreeMap;

public class Semantico implements Constants {

	Stack<Integer> stack = new Stack();
	TreeMap<String, Integer> variavel = new TreeMap<>();
	boolean existe = false, temValor = false;
	String var = "";
	

	public void executeAction(int action, Token token) throws SemanticError {

		Integer a, b;
		
		switch (action) {

		case 1:			
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			if(existe) 
			{
				variavel.put(var, stack.pop());
				existe = false;
			}
			if(temValor) 
			{
				variavel.remove(var);
				variavel.put(var, stack.pop());
				temValor = false;
			}
			break;
		case 5:
			System.out.println(stack.pop());
			break;
		case 6:
			a = stack.pop();
			b = stack.pop();
			stack.push(a + b);
			break;
		case 7:
			a = stack.pop();
			b = stack.pop();
			stack.push(a - b);
			break;
		case 8:
			break;
		case 9:
			a = stack.pop();
			b = stack.pop();
			stack.push(a * b);
			break;
		case 10:
			a = stack.pop();
			b = stack.pop();
			stack.push(a / b);
			break;
		case 11:
			break;
		case 12:
			break;
		case 13:
			if(variavel.containsKey(token.getLexeme()))
			{
				int val = variavel.get(token.getLexeme());
				stack.push(val);
			}else {
				throw new SemanticError("Variável não foi inicializada!");
			}
			break;
		case 14:
			String tmp = token.getLexeme();
			stack.push(Integer.valueOf(tmp));
			break;
		case 15:
			var = token.getLexeme();
			if(variavel.containsKey(var))
			{
				temValor = true;
			}else{
				existe = true;
			}
			break;

		}

	//System.out.println("Ação #" + action + ", Token: " + token);
	}
}
