package Practice;

import java.util.regex.*;  
class JavaRegexEx{  
	public static void main(String args[]){  
		System.out.println(Pattern.matches("[amn]", "o"));//false (not a or m or n)  
		System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
		System.out.println(Pattern.matches("[amn]", "amn"));//false (m and a comes more than once)  
		
		System.out.println("******************************");
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(Pattern.matches("s", "s"));//true (2nd char is s)  
		System.out.println(Pattern.matches(".s", "ms"));//false (2nd char is not s)  
		System.out.println(Pattern.matches("..t", "mst"));//false (has more than 2 char)  
		System.out.println(Pattern.matches(".mm.", "amms"));//false (has more than 2 char)  
		System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)  
	}}  