package by.introduction.first.leaner1.main;
/*
3. Stings and basics of text processing
 
   Работа со строкой как с объектом типа String или StringBuilder

7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. 
   Например, если было введено "abc cde def", то должно быть выведено "abcdef".
*/
public class Solution82 {

	public static void main(String[] args) {
	
		String s = "Java is a high-level, class-based, object-oriented programming language";;
			
		System.out.println(removeDuplicateCharacters(s));		
	}

	private static String removeDuplicateCharacters(String str) {
		
		String result = "";
		
		for (int i = 0; i < str.length(); i++) {						
			if (! Character.isWhitespace(str.charAt(i)) && ! result.contains(Character.toString(str.charAt(i)))) {
				result += str.charAt(i);		
			} 			
		}
		
		return result;
	}	
}
