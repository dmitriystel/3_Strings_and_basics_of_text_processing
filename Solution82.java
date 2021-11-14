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
			
		System.out.println(removeDuplicatecharacters(s));		
	}

	private static String removeDuplicatecharacters(String str) {
		
		String res = "";
		
		for (int i = 0; i < str.length(); i++) {
						
			if (! Character.isWhitespace(str.charAt(i)) && ! res.contains(Character.toString(str.charAt(i)))) {
				res += str.charAt(i);		
			} 			
		}
		
		return res;
	}	
}
