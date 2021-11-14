package by.introduction.first.leaner1.main;
/*
3. Stings and basics of text processing
 
   Работа со строкой как с массивом символов

2. Замените в строке все вхождения 'word' на 'letter'.
*/
public class Solution72 {

	public static void main(String[] args) {
	
		String s = "word is a word processor developed by Microsoft";
				
		System.out.println(wortToLetter(s));				
    }
	
	private static String wortToLetter(String str) {
		
		String res = "";
			
	       char[] charArray = new char[str.length()];
	       for (int i = 0; i < str.length(); i++) {
	           charArray[i] = str.charAt(i);	              
	        }
	       
	       for(int j = 0; j < charArray.length; j++) {
	    	   
	    	   if (    (Character.toString(charArray[j]).equals("w")) &&
	    	       (Character.toString(charArray[j + 1]).equals("o")) &&
	    		   (Character.toString(charArray[j + 2]).equals("r")) &&
	    		   (Character.toString(charArray[j + 3]).equals("d"))) {
	    		   res += "letter";
	    		   j += 3;
	    		   
	    	   } else res += (Character.toString(charArray[j]));
	    	   
	       }
				
		return res;
	}
	
}
		
		    
