package $009week5.light;

import $009.light.LightView;

public class Light {
	private LightView observer;//1老虎
	private boolean on;
	public void register(LightView observer) {//2观察者
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
		observer.update();//3观察到信息
	}

	
	
}
