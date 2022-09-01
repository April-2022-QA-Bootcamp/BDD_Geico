package geico.bdd.unit.codingChallenges;

import java.util.Stack;

public class ValidParantheses {

	/*
	 * 1. there is a string with contains numbers letters and special chars
	 * 2. find the patterns of the parentheses are in correct order
	 * 3. such as []{}(), [{()}], [{}()] - valid
	 * 4. invalid - }[()], [({)], [({{})}
	 */
	
	public static void main(String[] args) {
		String invalid = "[ab16526*!dc(())ef{}[{]]";
		System.out.println(isValid(invalid));
		String valid = "[ab16526*!dc(())ef{}[]]";
		System.out.println(isValid(valid));
	}
	
	public static boolean isValid(String input) {
		String string = input.replaceAll("[^\\[{()}\\]]", "");
		Stack<Character> stack = new Stack<Character>();
		for(Character c : string.toCharArray()) {
			if(c == '[' || c == '{' || c == '(') {
				stack.push(c);
			}else if(c == ']') {
				if(stack.isEmpty() || stack.peek() != '[')
					return false;
				stack.pop();
			}else if(c == '}') {
				if(stack.isEmpty() || stack.peek() != '{')
					return false;
				stack.pop();
			}else if(c == ')') {
				if(stack.isEmpty() || stack.peek() != '(')
					return false;
				stack.pop();
			}
		}
		return stack.size() == 0;
	}
	/*
	 * Stack - LIFO - Last In First Out
	 * 1. Replace anything that is not parentheses
	 * 2. Convert string into char array using toCharArray() method
	 * 3. Declare a stack of char
	 * 4. iterate through the array
	 * 5. condition - if opening of brackets [{(
	 * 					push it to stack
	 * 				else if closing of each of these })]
	 * 					condition - if stack is empty or stack.peek() is not corresponding each of these [{(
	 * 						return invalid pattern
	 * 					stack.pop();
	 * stack will be empty if valid or will not be empty if invalid
	 */
}
