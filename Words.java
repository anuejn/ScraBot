import java.util.ArrayList;

public class Words extends ArrayList<String>{

	private static final long serialVersionUID = 1L;

	public boolean contains(String toCheck) {
		for(int i = 0; i < size(); i++) {
			if(this.get(i).equalsIgnoreCase(toCheck)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean addIf(String toAdd) {
		if(this.contains(toAdd)) {
			return false;
		}
		this.add(toAdd);
		return true;
	}

}
