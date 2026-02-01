package certify.java.braces;

import java.util.*;
import java.util.Scanner;

// Write your code here. DO NOT use an access modifier in your class declaration.
class Parser{
    static String isBalanced(String s) 
    {
    	String result = "true";
    	String[] a = s.split(",");
    	
    	Stack<String> stack = new Stack<>();
    	
    	if(s.isBlank() || s.isEmpty()) {
    		return "true";
    	}
    	
    	// have to use s.length() == 0 for java 8 
    	
    	for(String elem : a) {
    		String[] array = elem.split("");
    		
    		for(int i = 0; i < array.length; i++) {
    			String brace = array[i];
    			if(brace.equals("(") || brace.equals("{")) {
    				stack.push(brace);
    			}
    			else if(brace.equals(")")){
    				if(!stack.empty()) {
						if (!stack.pop().equals("(")) {
							result = "false";
							return result;
						}
    				}else {return "false";}
    				
    			}else if(brace.equals("}")) {
    				if(!stack.empty()) {
    					if(!stack.pop().equals("{")) {
    					result = "false";
    					return result;
    					}
    				}else {return "false";}
    				
    			}
    		}
    	}
    	if(!stack.isEmpty()) {
    		return "false";
    	}
    	
    	return result;
    }
    
}

class Solution {
	
	public static void main(String[] args) {
		Parser parser = new Parser();
        
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			System.out.println(parser.isBalanced(in.next()));
		}
        
		in.close();
	}
}

