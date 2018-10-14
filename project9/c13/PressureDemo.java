package c13;

public class PressureDemo{	
	public static void main(String[] args){
		Pressure[] p1 = new Pressure[10];
		for(int i = 0; i < 10; i++){
			p1[i] = new Pressure();
			p1[i].start();
		}
		try {
			for(int i = 0;i < 10;i++)
				p1[i].join();//join()等待线程结束
		}catch(Exception e){}
		System.out.println("气压表的读数是："
		               +Pressure.pressureGauge
		               +"安全上限是："
		               +Pressure.safetyLimit);
	}
}

