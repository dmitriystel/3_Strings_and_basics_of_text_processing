package by.introduction.first.leaner1.main;
/*
3. Stings and basics of text processing
 
   Работа со строкой как с объектом типа String или StringBuilder

9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. 
   Учитывать только английские буквы.
*/
public class Solution84 {

	public static void main(String[] args) {
		
		String s = "Строка. The String class represents character strings";
		
		System.out.println("number of small letters: " + numberOfSmallLetters(s));
		System.out.println("number of capital letters: " + numberOfCapitalLetters(s));		
    }
	
	private static int numberOfSmallLetters(String str) {
		
		int res = 0;
		
		char[] smallLetters = {'\u0061', '\u0062', '\u0063', '\u0064', '\u0065', '\u0066', '\u0067', 
				'\u0068', '\u0069', '\u006A', '\u006B', '\u006C', '\u006D', '\u006E', '\u006F', 
				'\u0070', '\u0071', '\u0072', '\u0073', '\u0074', '\u0075', '\u0076', '\u0077', 
				'\u0078', '\u0079', '\u007A'};
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < smallLetters.length; j++) {
				 if(str.charAt(i) == smallLetters[j]) {
					 res++;
				 }				
			}
		}
		
		return res;
	}

	private static int numberOfCapitalLetters(String str) {
		
		int res = 0;
		
		char[] capitalLetters = {'\u0041', '\u0042', '\u0043', '\u0044', '\u0045', '\u0046', 
				'\u0047', '\u0048', '\u0049', '\u004A', '\u004B', '\u004C', '\u004D', '\u004E', 
				'\u004F', '\u0050', '\u0051', '\u0052', '\u0053', '\u0054', '\u0055', '\u0056', 
				'\u0057', '\u0058', '\u0059', '\u005A'};
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < capitalLetters.length; j++) {
				 if(str.charAt(i) == capitalLetters[j]) {
					 res++;
				 }				
			}
		}
		
		return res;
	}
}


