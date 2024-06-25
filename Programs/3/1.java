/*
1. WAP to Check for Balanced Brackets in an expression using Stack

ip1:
[()]{}{[()()]()}
op1:
Balanced

ip2:
[(])
op2:
Not Balanced

ip3:
({[]})(
op3:
Not Balanced

ip4:
{{{}}
Not Balanced
*/

import java.util.Stack;
import java.util.*;
 
class Solution {
 
 public static void main(String[] args) {
	 Scanner in=new Scanner(System.in);
	 //System.out.println(" enter your string ");
	 String str=in.nextLine();
 String checkBalancedExpr1=checkBalancedParentesis(str);
 System.out.println(checkBalancedExpr1);
 
 }
 public static String checkBalancedParentesis(String expr)
 {
 if (expr.isEmpty())
 return "Balanced";
 
 Stack<Character> stack = new Stack<Character>();
 for (int i = 0; i < expr.length(); i++)
 {
 char current = expr.charAt(i);
 if (current == '{' || current == '(' || current == '[')
 {
 stack.push(current);
 }
 if (current == '}' || current == ')' || current == ']')
 {
 if (stack.isEmpty())
 return "Not Balanced";
 char last = stack.peek();
 if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
 stack.pop();
 else 
 return "Not Balanced";
 }
 }
 return stack.isEmpty()?"Balanced":"Not Balanced";
 }
 
}