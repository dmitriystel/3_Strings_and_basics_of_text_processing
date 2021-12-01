package by.introduction.first.leaner1.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
3. Stings and basics of text processing

   Работа с регулярными выражениями (Pattern, Matcher)

1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять 
   с текстом три различных операции: отсортировать абзацы по количеству предложений; 
   в каждом предложении отсортировать слова по длине; отсортировать лексемы в предложении 
   по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.
*/
public class Solution86 {

	public static void main(String[] args) {
		
		String s = "In computer programming, a string is traditionally a sequence of characters, "
				+ "either as a literal constant or as some kind of variable. The latter may allow "
				+ "its elements to be mutated and the length changed, or it may be fixed "
				+ "after creation. A string is generally considered as a data type and is often "
				+ "implemented as an array data structure of bytes or words that stores a sequence "
				+ "of elements, typically characters, using some character encoding. String may also "
				+ "denote more general arrays or other sequence or list data types and structures.\r\n"
				+ "\r\n"
				+ "Depending on the programming language and precise data type used, a variable "
				+ "declared to be a string may either cause storage in memory to be statically "
				+ "allocated for a predetermined maximum length or employ dynamic allocation to allow "
				+ "it to hold a variable number of elements.\r\n"
				+ "\r\n"
				+ "When a string appears literally in source code, it is known as a string literal or "
				+ "an anonymous string.In formal languages, which are used in mathematical logic and theoretical computer "
				+ "science, a string is a finite sequence of symbols that are chosen from a set called "
				+ "an alphabet.\r\n"
				+"\r\n";
		
		System.out.println("Sorted paragraphs by the number of sentences:");
		System.out.println(sortParagraphsByNumOfSentences(s));
		System.out.println("Words in each sentence are sorted by length:");
		System.out.println();
        System.out.println(sortingWordsbyLength(s));
        System.out.println("Sorted lexems in a sentence in descending order:");
		System.out.println(descendingLexemsInSentence(s));				
	}
	
	private static String sortingWordsbyLength(String str) {
				
	    Pattern pattern = Pattern.compile("[A-Z].+?\\.|!|\\?");
	    Matcher matcher = pattern.matcher(str); 
	    
		String sentence;	
		String[] words;
        String res1 = "";        
        String result = ""; 
	    
	    while (matcher.find()) {	        
	        sentence = str.substring(matcher.start(), matcher.end());	        
	        words = sentence.split("\\s*(\\s|,|!|\\.)\\s*");
	        														        	       
	        String temp = null;
	        
	        for (int i = 0; i < words.length - 1; i++) {
	        	for (int j = i + 1; j< words.length; j++) {
	        		if (words[i].length() < words[j].length()) {
	        			temp = words[i];
	        			words[i] = words[j];
	        			words[j] = temp; 
	        		}        		
	        	}
	        }
	        
	        String res = "";	    	
	    	
	        for (String elem : words) {
	        	res += elem + " ";
	        }
	        	        
	        res1 = (Character.toUpperCase(res.charAt(0)) + res.substring(1)).replaceAll("[ ]$" ,"\\.");
	        
	        result += res1 +  "\n"; 	        	        	       	        	   	        	        
	    }
		return result;
	}

	private static String sortParagraphsByNumOfSentences(String str) {
		
		String result = "";
		
		String [] text = new String[3]; 
		int [] numOfsentences = new int [3]; 
		
		String paragraph = "";
		
	    Pattern pattern = Pattern.compile("(?sm)^.*?\\.\\s*$");	 
	    Matcher matcher = pattern.matcher(str);
	    
    	int i = 0;
	    while (matcher.find()) {	        
	        paragraph = str.substring(matcher.start(), matcher.end());	        
	        text [i] = paragraph;
	        i++;
		
	}
	    	    
	    for (int j = 0; j < text.length; j++) {	    
	    	int counter = 0; 
	    	
	    Pattern pattern1 = Pattern.compile("[A-Z].+?\\.|!|\\?");
	    Matcher matcher1 = pattern1.matcher(text[j]);
	    
	    while (matcher1.find()) {	        
	        text[j].substring(matcher1.start(), matcher1.end());
	        counter++;	        	       	        	   	        	        
	    }
	    
	    numOfsentences[j] = counter;
	    
	    }
	    	
	    int temp = 0; 
	    String temp1 = null; 
	    
	    for (int k = 0; k < numOfsentences.length - 1; k++) {
	    	for (int l = k + 1; l < numOfsentences.length; l++) {	    	
	    		if (numOfsentences[k] > numOfsentences[l]) {
	    		
	    			temp = numOfsentences[l]; 
	    			numOfsentences[l] = numOfsentences[k];
	    			numOfsentences[k] = temp; 
	    				    			
	    			temp1 = text[l];
	    			text[l] = text[k];
	    			text[k] = temp1; 	    			
	    		}
	    	}
	    }
	    	    
	    for (String elem : text) {	    	
	    	result += elem; 
	    }	    
		return result;
	}
	
	
	private static String descendingLexemsInSentence(String str) {		
	    Pattern pattern = Pattern.compile("[A-Z].+?\\.|!|\\?");
	    Matcher matcher = pattern.matcher(str); 
	    
		String sentence;		
		String[] words;
              
        String result = ""; 
  
	    while (matcher.find()) {	    	
	    	int elements = 0;	        
	        sentence = str.substring(matcher.start(), matcher.end());	        
	        words = sentence.split("\\s*(\\s|,|!|\\.)\\s*");
	        														        	       
	        String temp = null;
	        	        
	        for (int i = 0; i < words.length; i++) {	        	
	        	if (words[i].contains(String.valueOf("a"))){
	        		elements++;
	        	}	        	
	        }
	        
	        String [] words1 = new String [elements];
	        int [] words1nrElem = new int[elements];
	        
	        int j = 0; 
	        
	        for (int i = 0; i < words.length; i++) {        	
	        	if (words[i].contains(String.valueOf("a"))){
	        		words1[j] = words[i];
	        		j++;
	        	}	        	
	        }
	        	        
	        String word = null; 
   		
	        for (int i = 0; i < words1.length; i++) {	        	
	        	word = words1[i];
	    		int count = 0; 
	        		    		
	        	for (int k = 0; k < word.length(); k++) {	        		
	        		if (word.charAt(k) == 'a') {
	        			count++;
	        		}	        		
	        	}
	        	
	        	words1nrElem[i] = count;  	        	
	        }	        	        
	        	        
	        int temp1 = 0; 
		    String temp2 = null; 
		    		    
		    for (int k = 0; k < words1nrElem.length - 1; k++) {
		    	for (int l = k + 1; l < words1nrElem.length; l++) {		    	
		    		if (words1nrElem[k] < words1nrElem[l]) {
		    		
		    			temp1 = words1nrElem[l]; 
		    			words1nrElem[l] = words1nrElem[k];
		    			words1nrElem[k] = temp1; 
		    				    			
		    			temp2 = words1[l];
		    			words1[l] = words1[k];
		    			words1[k] = temp2; 
		    			
		    		} else if (words1nrElem[k] == words1nrElem[l]) {		    			
		    			if (words1[k].charAt(0) > words1[l].charAt(0)){
		    			
			    			temp1 = words1nrElem[l]; 
			    			words1nrElem[l] = words1nrElem[k];
			    			words1nrElem[k] = temp1; 
			    				    			
			    			temp2 = words1[l];
			    			words1[l] = words1[k];
			    			words1[k] = temp2; 
		    				
		    			}		    			
		    		}		    		
		    	}
		    }
	        
		    for (String elem : words1) {		    	
		    	result += elem + " "; 
		    }
		    
		    result += "\n";	          	        	       	        	   	        	        
	    }
	    
		return result;
	}
}
