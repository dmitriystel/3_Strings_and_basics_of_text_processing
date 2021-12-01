package by.introduction.first.leaner1.main;
/*
 3. Stings and basics of text processing
 
   Работа со строкой как с объектом типа String или StringBuilder

10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, 
    восклицательным или вопросительным знаком. Определить количество предложений в строке X.
*/
public class Solution85 {

	public static void main(String[] args) {
		
		String s = "What do we mean by the word English? There is, of course,"
				+ " the language - the one that has become the world's main means"
				+ " of verbal communication. But what about the English - in "
				+ "the sense of people from England? Ask a Cockney from London, "
				+ "or a Brummie from Birmingham, or a Geordie from Newcastle about"
				+ " their nationality, and he or she will most probably answer "
				+ "English. Yet look at his or her passport, and you'll see that"
				+ " it is a British passport, defining the holder as a citizen"
				+ " of the United Kingdom. Nowhere is there any mention of the word"
				+ " England!";
		
		System.out.println(countNumberOfSentences(s));
		
	}
	
	private static int countNumberOfSentences(String str) {
		
		int result = 0;
		
		for (int i = 0; i < str.length(); i++) {
		
			if (str.charAt(i) == '.' || str.charAt(i) == '?' || str.charAt(i) == '!'  ) {
				result++;
			}
		}
				
		return result;
	}
}
