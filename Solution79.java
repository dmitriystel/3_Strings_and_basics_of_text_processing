package by.introduction.first.leaner1.main;
/*
 3. Stings and basics of text processing
 
   Работа со строкой как с объектом типа String или StringBuilder
   
4. С помощью функции копирования и операции конкатенации составить из частей слова 
   “информатика” слово “торт”.
 */
public class Solution79 {

	public static void main(String[] args) {

        String word = "информатика";

        String o = word.substring(3, 4);
        String r = word.substring(4, 5);
        String t = word.substring(7, 8);
        String cake = t.concat(o).concat(r).concat(t);
        System.out.println(cake);
	}
}


