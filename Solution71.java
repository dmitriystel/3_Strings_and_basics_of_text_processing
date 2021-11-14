package by.introduction.first.leaner1.main;
/*
 3. Stings and basics of text processing
 
    Работа со строкой как с массивом символов
 
1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */
public class Solution71 {

	public static void main(String[] args) {
		
		String s = "yourCar hisCar herCar ourCar theirCar";
				
		System.out.println(toSnakeCase(s));
	}
	
	private static String toSnakeCase(String str) {

	       char[] charArray = new char[str.length()];
	       
	       for (int i = 0; i < str.length(); i++) {
	           charArray[i] = str.charAt(i);
	        }
	       		
		String res = "";
		
		for (int i = 0; i < charArray.length; i++) {
			    
			    if (Character.isLowerCase(charArray[i])) {
			    	res += charArray[i];
			    } else if (Character.isUpperCase(charArray[i])) {
			    	res += "_" + Character.toLowerCase(charArray[i]);	    	
			    } else if(Character.isWhitespace(charArray[i])) {
			    	res += " ";
			    }			    		
		}
				
		return res;
	}	
}

