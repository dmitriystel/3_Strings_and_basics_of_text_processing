package by.introduction.first.leaner1.main;
/*
3. Stings and basics of text processing
 
   Работа со строкой как с объектом типа String или StringBuilder

6. Из заданной строки получить новую, повторив каждый символ дважды.
*/
public class Solution81 {

	public static void main(String[] args) {

		String s = "Java is a high-level, class-based, object-oriented programming language";

		System.out.println(createNewStringWithDoubleSymbol(s));
	}

	private static String createNewStringWithDoubleSymbol(String str) {
		
		String result = "";
		
		for (int i = 0; i < str.length(); i++) {			
			result = result + str.charAt(i) + str.charAt(i);
		}
		
		return result;
	}
}
