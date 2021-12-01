package by.introduction.first.leaner1.main;
/*
3. Stings and basics of text processing
 
   Работа со строкой как с объектом типа String или StringBuilder

8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. 
   Случай, когда самых длинных слов может быть несколько, не обрабатывать.

*/
public class Solution83 {

	public static void main(String[] args) {
		
		String s = "The String class represents character strings";

		System.out.println(findLongestWord(s));
	}

	private static String findLongestWord(String str) {
				
		String result = "";
		String currentWord = "";
		int count; 
		int max = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			if (Character.isLetter(str.charAt(i))) {				
				count = 0;
				currentWord = "";
				
				while(i < str.length() && Character.isLetter(str.charAt(i))) {					
					currentWord += str.charAt(i);
					count++;
					i++;				
				}
				
				if (count > max) {
					max = count;
					result = currentWord;					
				}
			}
		}
		
		return result;
	}	
}
