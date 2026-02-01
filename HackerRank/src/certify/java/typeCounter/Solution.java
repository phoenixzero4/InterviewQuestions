package certify.java.typeCounter;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'typeCounter' function below.
     *
     * The function accepts STRING sentence as parameter.
     */

    public static void typeCounter(String sentence) {
    	
    	HashMap<String, Integer> map = new HashMap<>();
    	map.put("string", 0);
    	map.put("integer", 0);
    	map.put("double",  0);
    	
    	String[] array = sentence.split(" ");
    	
    	for(String s : array) {
    		
    		try {
    			int i = Integer.parseInt(s);
    			map.put("integer", map.get("integer")+1);
    		}catch(Exception e) {
    			try {
    				double d = Double.parseDouble(s);
    				map.put("double",  map.get("double")+1);
    			}catch(Exception ex) {
    				map.put("string",  map.get("string")+1);
    			}
    		}
    		
    	}
    	System.out.println("string " + map.get("string"));
    	System.out.println("integer " + map.get("integer"));
    	System.out.println("double " + map.get("double"));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sentence = bufferedReader.readLine();

        Result.typeCounter(sentence);

        bufferedReader.close();
    }
}

