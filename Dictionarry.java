import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Dictionarry {
	
	private ArrayList<String> list = new ArrayList<String>();
	
	public Dictionarry(ArrayList<String> list) {
		this.list = list;
	}
	
	public Dictionarry(String filname) throws IOException {
		  InputStream is = getClass().getResourceAsStream(filname);
		  InputStreamReader isr = new InputStreamReader(is);
		  BufferedReader br = new BufferedReader(isr);
		  String line;
		  while ((line = br.readLine()) != null)
		  {
			  list.add(line);
		  }
		  br.close();
		  isr.close();
		  is.close();
	}
	
	public ArrayList<String> getWords() {
		return list;
	}
	
	public ArrayList<String> getWordsBeginWith(String begin) {
		ArrayList<String> out = new ArrayList<String>();
		for(String now: list) {
			if(now.startsWith(begin)) {
				out.add(now);
			}
		}
		return out;
	}
	
	public Boolean isAWord(String word) {
		for(String now: list) {
			if(now.equalsIgnoreCase(word)) {
				return true;
			}
		}
		return false;
	}
}
