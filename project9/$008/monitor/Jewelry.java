package $008.monitor;

import java.util.ArrayList;

public abstract class Jewelry {
 
	protected ArrayList<Beast> beasts;
	 
	public Jewelry() {
		beasts = new ArrayList<Beast>();
	}	 
	public void registerObserver(Beast beast) {
		beasts.add(beast);
	}	 
	public void removeObserver(Beast beast) {
		beasts.remove(beast);
	}
	 
	public abstract void notifyObservers();
}
 
