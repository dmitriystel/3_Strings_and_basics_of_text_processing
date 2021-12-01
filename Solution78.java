package by.introduction.first.leaner1.main;
/*
3. Stings and basics of text processing
 
   Работа со строкой как с объектом типа String или StringBuilder

3. Проверить, является ли заданное слово палиндромом.
*/
public class Solution78 {
	
	public static void main(String[] args) {
		String s = "level"; 
				 
		System.out.println(checkIfItPalindrome(s));
	}

	private static boolean checkIfItPalindrome(String str) {
	
		String reverseString = ""; 
		
		for (int i = 0; i < str.length(); i++) {
			
			reverseString += str.charAt(str.length() - 1 - i); 			
		}
				
	return str.equals(reverseString); 
	
	}
}
