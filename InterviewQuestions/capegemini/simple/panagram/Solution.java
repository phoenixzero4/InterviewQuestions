package capegemini.simple.panagram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/* 
 * check if a string is a panagram (contains all letters in the alphabet)
 */


public class Solution {

	static HashMap<Character, Integer>map;
	static List<Character> list = new ArrayList<>();
	
	public static List<Character> findMissingLetters(String s){
		
		s = s.toUpperCase().replaceAll(" ", "").trim();
		char[] array = s.toCharArray();
		
		for(Character c : array) {
			System.out.println(c);
			map.put(c,  map.get(c)+1);
		}
		
		System.out.println(map);
		
		for(Entry<Character, Integer> entries : map.entrySet()) {
			Character key = entries.getKey();
			Integer value = entries.getValue();
			
			if(value == 0) {
				list.add(key);
			}
		}
		return list;
		
	}
	public static void main(String[] args) {
		
		map = new HashMap<>();
		
		for(int i = 65; i <= 90; i++) {
			char c = (char) i;
			System.err.println(c);
			map.put(c, 0);
		}
		System.out.println(map);
		String sentence = "The quick brown fox jumps over the lazy dog";
		String s2 = "Not a panagram at all";
		
		list = findMissingLetters(sentence);
		for(Character c: list) {
			System.out.print(c + " ");
		}
		map = new HashMap<>();
		for(int i = 65; i <= 90; i++) {
			char c = (char) i;
			System.err.println(c);
			map.put(c, 0);
		}
		list.clear();
		list = findMissingLetters(s2);
		
		for(Character c: list) {
			System.out.println(c + " ");
		}
		

	}

}
