package by.introduction.first.leaner1.main;
/*
3. Stings and basics of text processing
 
   Работа со строкой как с массивом символов

3. В строке найти количество цифр.
*/
public class Solution73 {

	public static void main(String[] args) {
		
		String s = "The 206 listed states can be divided into three categories "
				+ "based on membership within the United Nations System: 193 member "
				+ "states, 2 observer states and 11 other states.";
			
		System.out.println(numberOfdigits(s));
	}

	private static int numberOfdigits(String str) {
		
		int res = 0;
		
		 char[] charArray = new char[str.length()];
	       for (int i = 0; i < str.length(); i++) {
	           charArray[i] = str.charAt(i);	              
	        }
	       
	       for(int j = 0; j < charArray.length; j++) {
	    	   
	    	   if (Character.isDigit(charArray[j])) {
	    		   res += 1;
	    	   }    		   
	      } 
	    return res;		
	}	
}
