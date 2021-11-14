package by.introduction.first.leaner1.main;
/*
3. Stings and basics of text processing
 
   Работа со строкой как с объектом типа String или StringBuilder

5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
*/
public class Solution80 {

	public static void main(String[] args) {

		String s = "Java is a high-level, class-based, object-oriented programming language";
				
		System.out.println(frequencyA(s));

	}
	
	private static int frequencyA(String str) {
		
		int res = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == 'a') {
				
				res++;
			}			
		}
		
		return res;
	}
}
