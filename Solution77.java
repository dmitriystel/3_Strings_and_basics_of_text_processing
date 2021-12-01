package by.introduction.first.leaner1.main;
/*
3. Stings and basics of text processing
 
   Работа со строкой как с объектом типа String или StringBuilder

2. В строке вставить после каждого символа 'a' символ 'b'.
*/
public class Solution77 {

	public static void main(String[] args) {
		
		String s = "Java is a high-level, class-based, object-oriented programming language";
				
		System.out.println(insertBAfterA(s));
	}
	
	private static String insertBAfterA(String str) {

		String result = "";
 
	     for(int j = 0; j < str.length(); j++) {
	    	 
	    	 if (str.charAt(j) == 'a') {
	    		 result += "ab";
	    		   
	    	 } else result += str.charAt(j);	   
	      } 
	      	      		
		return result;
	}
}
