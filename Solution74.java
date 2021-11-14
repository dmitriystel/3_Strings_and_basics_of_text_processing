package by.introduction.first.leaner1.main;
/*
3. Stings and basics of text processing
 
   Работа со строкой как с массивом символов

4. В строке найти количество чисел.
*/
public class Solution74 {

	public static void main(String[] args) {
		
		String s = "The 206 listed states can be divided into three categories "
				+ "based on membership within the United Nations System: 193 member "
				+ "states, 2 observer states and 11 other states.";
	        
        System.out.println(amountOfNumbers(s));
        	
        }
	
	private static int amountOfNumbers(String str) {
		
		int res = 0;
		
		 char[] charArray = new char[str.length()];
		 
	       for (int i = 0; i < str.length(); i++) {
	           charArray[i] = str.charAt(i);	              
	        }
	       
	       for(int j = 0; j < charArray.length; j++) {
	    	   
	    	   if (Character.isDigit(charArray[j])) {
	    		   
	    		   while(Character.isDigit(charArray[j])){
	    			   j += 1;
	    		   }
	    		   
	    		   res += 1;
	    	   }    		   
	      } 
	       
	    return res;		
	}
}


