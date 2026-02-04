package capegemini.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problems{
	
	public static boolean checkAnagram(String s) {
		s = s.toLowerCase().replaceAll(",",  "");
		
		
		String[] array = s.split(" ");
		String word = "", word2 = "";
		
		for(int i = 0; i < array.length-1; i++) {
			word = array[i];
			String[] element = word.split("");
			Arrays.sort(element);
			
			String e1 = String.join("",element);
		//	System.out.println("e1 " + e1);
			for(int j = i + 1; j < array.length; j++) {
				word2 = array[j];
				String[] element2 = word2.split("");
				Arrays.sort(element2);
				String e2 = String.join("",element2);
			//	System.out.println("e2 " + e2);

				if(!e1.equals(e2)) {
					System.out.println(word + " not an anagram of " + word2);
					return false;
				}
			}
				System.out.println(word + " is an anagram of " + word2);
		
		}
	return true;
	
	}
	
	public static boolean checkAnagramList(String s) {
		String[] words = s.toLowerCase().replaceAll("[^a-z,;]",  "").split("[,;]");
		
		List<String> list = new ArrayList<>();
		
		for(String w : words) {
			w = w.trim();
			if(!w.isEmpty()) list.add(w);
		}
		
		if(list.size() < 2) return true;
		
		String sig0 = sortChars(list.get(0));
		
		for(int i = 1; i < list.size(); i++) {
			if(!sig0.equals((sortChars(list.get(i))))) return false;
		}
		return true;
		
	}
	
	private static String sortChars(String w) {
		char[] a = w.toCharArray();
		Arrays.sort(a);
		return new String(a);
	}
	
	
	public static void main(String[] args) {
		
		String true1 = "Dog, god";
		String true2 = "cat, act, TaC";
		String false1 = "angle, enganf";
		String false2 = "angle, glean, angel, legnaa";
		
		checkAnagram(true1);
		checkAnagram(true2);
		checkAnagram(false1);
		checkAnagram(false2);
		
		System.out.println();
		
	    System.out.println(checkAnagramList("dog, god"));                 // true
	    System.out.println(checkAnagramList("cat, act, Tac"));            // true
	    System.out.println(checkAnagramList("angle, enganr"));            // false
	    System.out.println(checkAnagramList("angle; glean; angel; legnnaa")); // false
		
		
	}
}