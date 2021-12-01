package by.introduction.first.leaner1.main;
/*
3. Stings and basics of text processing
 
   Работа со строкой как с массивом символов

2. Замените в строке все вхождения 'word' на 'letter'.
*/
public class Solution72 {

	public static void main(String[] args) {
	
		String s = "word is a word processor developed by Microsoft";
				
		System.out.println(changeWordToLetter(s));				
    }
	
	private static String changeWordToLetter(String str) {
		
		String result = "";
			
	       char[] charArray = new char[str.length()];
	       
	       for (int i = 0; i < str.length(); i++) {
	           charArray[i] = str.charAt(i);	              
	        }
	       
	       for(int j = 0; j < charArray.length; j++) {
	    	   
	    	   if ((Character.toString(charArray[j]).equals("w")) &&
	    	       (Character.toString(charArray[j + 1]).equals("o")) &&
	    		   (Character.toString(charArray[j + 2]).equals("r")) &&
	    		   (Character.toString(charArray[j + 3]).equals("d"))) {
	    		   result += "letter";
	    		   j += 3;
	    		   
	    	   } else result += (Character.toString(charArray[j]));	    	   
	       }
				
		return result;
	}	
}
		
		    
