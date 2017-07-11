
import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
	public static void main(String[] args) {
		ArrayList<String>[] arrayOfStringList = createList();
		printList(arrayOfStringList);
	}

	public static ArrayList<String>[] createList() {
		ArrayList<String>[]     arrayLists = new ArrayList[5];

		for (int i = 0; i < 5; i++) {
			arrayLists[i] = new ArrayList<>();
			arrayLists[i].add("I");
			arrayLists[i].add("<3");
			arrayLists[i].add("Java");
		}

		return (arrayLists);
	}

	public static void printList(ArrayList<String>[] arrayOfStringList) {
		for (ArrayList<String> list : arrayOfStringList) {
			for (String s : list) {
				System.out.println(s);
			}
		}
	}
}