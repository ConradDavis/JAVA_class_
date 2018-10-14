package $009.light;

public class Light {
	private LightView observer;//11�ϻ�
	private boolean on;
	public void register(LightView observer) {//2�۲���
		this.observer = observer;
	}
	public Light() {
		on = false;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
		observer.update();//3�۲쵽��Ϣ
	}

	
	
}
