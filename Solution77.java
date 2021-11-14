package by.introduction.first.leaner1.main;
/*
3. Stings and basics of text processing
 
   Работа со строкой как с объектом типа String или StringBuilder

2. В строке вставить после каждого символа 'a' символ 'b'.
*/
public class Solution77 {

	public static void main(String[] args) {
		
		String s = "Java is a high-level, class-based, object-oriented programming language";
				
		System.out.println(bAfterA(s));
	}
	
	private static String bAfterA(String str) {

		String res = "";
 
	     for(int j = 0; j < str.length(); j++) {
	    	 
	    	 if (str.charAt(j) == 'a') {
	    		 res += "ab";
	    		   
	    	 } else res += str.charAt(j);	   
	      } 
	      	      		
		return res;
	}
}
