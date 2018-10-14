package $008.weather;

public class WeatherData implements Subject {
	private Observer[] observers;
	private int index = 0;
	public double getT() {
		return 15;
	}	 
	public double getH() {
		return 45;
	}	 
	public double getP() {
		return 1000;
	}
	 	
	public WeatherData(int count) {
		observers = new Observer[count];
	}
	public void changed() {
		this.notifyAllObserver();
	}
	public void register(Observer o) {
		observers[index++] = o;
	}	
	public void remove(Observer o) {
		for(int i=0;i<index;i++) {
			if(observers[i] == o) {
				while(i<index-1) {
					observers[i] = observers[i+1];
					i++;
				}
				index--;
				break;
			}
		}
	}
	public void notifyAllObserver() {	
		for(int i = 0;i<index;i++) {
			observers[i].update(getT(),getH(),getP());
		}
	}
	 
}
 
