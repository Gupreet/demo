package com.dct;

public class BalancedParentheses {

	static class Stack {
		int top = -1;
		char[] items = new char[100];
		void push(char c) {
			if (top == 99)
				System.err.println("Stack full");
			else
				items[++top] = c;
		}
		char pop() {
			char c = items[top];
			top--;
			return c;
		}
		boolean isEmpty() {
			return (top == -1) ? true : false;
		}
	}
	
	public boolean isMatchingPair(char c1,char c2) {
		if(c1 == '{' && c2 == '}')
			return true;
		else if(c1 == '[' && c2 == ']') 
			return true;
		else if(c1 == '(' && c2 == ')') 
			return true;
		else
			return false;
	}
	
	public boolean isBalancedParan(String s) {
	
		Stack st= new Stack();
		char[] c= s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			
			if(c[i] == '{' || c[i] == '(' || c[i] == '[') 
				st.push(c[i]);
			else if(c[i] == '}' || c[i] == ')' || c[i] == ']') 
				return st.isEmpty() ? false : !isMatchingPair(st.pop(),c[i]);
		} 
		
		
		return st.isEmpty() ? false : true;
	}
	
	
	
	
}
