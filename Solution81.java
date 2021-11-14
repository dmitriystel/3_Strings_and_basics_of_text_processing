package by.introduction.first.leaner1.main;
/*
3. Stings and basics of text processing
 
   Работа со строкой как с объектом типа String или StringBuilder

6. Из заданной строки получить новую, повторив каждый символ дважды.
*/
public class Solution81 {

	public static void main(String[] args) {

		String s = "Java is a high-level, class-based, object-oriented programming language";

		System.out.println(doubleSymbol(s));
	}

	private static String doubleSymbol(String str) {
		
		String res = "";
		
		for (int i = 0; i < str.length(); i++) {
			
			res = res + str.charAt(i) + str.charAt(i);
		}
		
		return res;
	}
}
