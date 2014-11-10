import java.util.ArrayList;


public class Checker {
	
	private Dictionarry dict;
	
	public Checker(Dictionarry dict) {
		this.dict = dict;
	}

	public ArrayList<String> check(String chars, String allready) {
		Words words = new Words();
		for(int i = 0; i < chars.length(); i++) {
			ArrayList<String> fordict = dict.getWordsBeginWith(allready + chars.charAt(i));
			if(fordict.size() != 0) {
				Dictionarry newDict = new Dictionarry(fordict);
				Checker ch = new Checker(newDict);
				StringBuffer s = new StringBuffer(chars);
				ArrayList<String> wordIGet = ch.check(s.deleteCharAt(s.indexOf(""+chars.charAt(i))).toString(), allready + chars.charAt(i));
				for(String now: wordIGet) {
					words.addIf(now);
				}
				if(newDict.isAWord(allready + chars.charAt(i))) {
					words.addIf(allready + chars.charAt(i));
				}
			}
		}
		return words;
	}
}
