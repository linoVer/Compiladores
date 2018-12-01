package compiler;

import java.util.Stack;

public class Semantico implements Constants {

	Stack<Integer> stack = new Stack();

	public int getResult() {
		return ((Integer) stack.peek()).intValue();
	}

	public void executeAction(int action, Token token) throws SemanticError {

		Integer a, b, c = 0, result = 0;

		switch (action) {

		case 1:
			
			break;
		case 2:

			break;
		case 3:
			break;
		case 4:
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
			break;
		case 14:
			String tmp = token.getLexeme();
			stack.push(Integer.valueOf(tmp));
			break;
		case 15:
			break;

		}

	System.out.println("Ação #" + action + ", Token: " + token);
	}
}
