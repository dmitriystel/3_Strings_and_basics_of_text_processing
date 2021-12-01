package by.introduction.first.leaner1.main;
/*
3. Stings and basics of text processing
 
   Работа со строкой как с объектом типа String или StringBuilder

1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
   Работа со строкой как с объектом типа String или StringBuilder
*/
public class Solution76 {

	public static void main(String[] args) {
		
		String s = "Java  is   a  high-level, class-based,     object-oriented         programming   language  ";
				
		System.out.println(countLargestNumOfConsecutiveSpaces(s));
	}
	
	private static int countLargestNumOfConsecutiveSpaces(String str) {

		int result = 0;
		int count;
 
	     for(int i = 0; i < str.length(); i++) {
	    	  
	    	 count = 0;
	    	 if (str.charAt(i) == ' ') {
	    		   
	    	     while(i < str.length() && str.charAt(i) == ' '){
	    			   
	    			  count++;
	    			  i++;
	    		   }
	    		   
	    		   if (count > result) {

	    			   result = count;
	    		   }	    		   
	    	   }	   
	      } 
	      	      		
		return result;
	}
}
