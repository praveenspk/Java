/**
 * 
 */
package com.spk.utility;

import java.util.Stack;

/**
 * @author Praveen
 *
 */
public class BalanceedParanthasis {

	public static void main(String[] args) {
		 System.out.println(test("{([)]}"));

		//isBalancedParanthesis("{([])[]}");
	}

	static boolean test(String str) {

		int flowBr = 0;
		int mathBr = 0;
		int opnBr = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			char temp;
			
			
			if (ch == '{') {
				temp=ch;
				flowBr++;
			}
			if (ch == '(') {
				temp=ch;
				opnBr++;
			}
			if (ch == '[') {
				temp=ch;
				mathBr++;
			}
			if (ch == '}') {
			
				flowBr--;
			}
			if (ch == '(') {
				opnBr--;
			}
			if (ch == ']') {
				mathBr--;
			}
		}
		if (mathBr == 0 && opnBr == 0 && flowBr == 0) {
			return true;
		}

		return false;
	}

	static void isBalancedParanthesis(String brackets) {

		Stack<Character> stack = new Stack<>();// CREATING THE stack FOR THE BRACKETS
		boolean isBalanced = true;// CHECKING WHETHER THE BRACKETS ARE BALANCED

		for (int i = 0; i < brackets.length(); i++) {// GETTING THROUGH ALL THE ELEMENTS FROM THE INPUT
			char bracket = brackets.charAt(i);// GETTING ONE SINGLE BRACKET AND PUTTING IT INTO THE char bracket
			if (bracket == '{' || bracket == '[' || bracket == '(') {// CHECKING WHETHER THE BRACKET TYPE IS THE OPENING
																		// ONE
				stack.push(bracket);// ADDING THE OPENING BRACKET INTO THE stack
			} else {
				if (bracket == '}') {
					bracket = '{';
				} else if (bracket == ')') {
					bracket = '(';
				} else if (bracket == ']') {
					bracket = '[';
				}

				if (stack.empty()) {// CHECKING WHETHER THE stack IS EMPTY
					isBalanced = false;
					break;
				}

				if (bracket == stack.peek()) {
					stack.pop();
				} else {
					isBalanced = false;
					break;
				}
			}
		}

		if (isBalanced) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
