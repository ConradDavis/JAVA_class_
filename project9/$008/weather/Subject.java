package $008.weather;

public interface Subject {
	 
	public abstract void register(Observer o);
	public abstract void remove(Observer o);
	public abstract void notifyAllObserver();
}
 
