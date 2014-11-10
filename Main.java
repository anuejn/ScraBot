import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class Main {
	
	public static void main(String[] args) throws IOException {
		System.out.println("this is Scrabble bot!");
		System.out.println("please enter your characters and the characters where you can dock to");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String in = br.readLine();
		//now we have the input :)
		
		Dictionarry dic = new Dictionarry("lowercase.dic");
		Checker ch = new Checker(dic);
		ArrayList<String> words = ch.check(in, "");
		
		for(String word: words) {
			System.out.println(word);
		}
		if(words.size() == 0) {
			System.out.println("sorry i cant find any words :(");
		}
	}
}
