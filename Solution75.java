package by.introduction.first.leaner1.main;
/*
3. Stings and basics of text processing
 
   Работа со строкой как с массивом символов

5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на 
   одиночные пробелы. Крайние пробелы в строке удалить.
*/
public class Solution75 {

	public static void main(String[] args) {
		
		String s = "Java  is   a  high-level, class-based,     object-oriented  "
				+ "       programming   language      ";
				
		System.out.println(whiteSpace(s));
	}
	
	private static String whiteSpace(String str) {

		String res = "";

		 char[] charArray = new char[str.length()];
		 
	       for (int i = 0; i < str.length(); i++) {
	           charArray[i] = str.charAt(i);	              
	        }

	      for(int j = 0; j < charArray.length; j++) {

	    	  if (Character.isLetter(charArray[j])) {
	    		  res += (Character.toString(charArray[j]));
	    		  
	    	  } else if (Character.isWhitespace(charArray[j])) {
	    		   
	    		   while(j < charArray.length && Character.isWhitespace(charArray[j])){
	    		
	    			   j++;
	    		   }
	    		   
	    		   if (j < charArray.length) {
	    			   if (Character.isLetter(charArray[j])) {
	    		
	    			   res += " " + (Character.toString(charArray[j]));
	    			   
	    			   } 
	    		   }
	    		   
	    	   } else res += (Character.toString(charArray[j]));	   
	      } 
	      	      		
		return res;
	}

}
