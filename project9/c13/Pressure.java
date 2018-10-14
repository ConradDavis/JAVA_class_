package c13;

public class Pressure extends Thread{
	public static int pressureGauge = 0;
	public static final int safetyLimit = 20;
	private synchronized static void raisePressure(){
		if (pressureGauge 
				   < safetyLimit - 15){
			try{
				sleep(100);
			}catch(Exception e){}
			pressureGauge +=15;
		}else;
	}			
	public void run(){
		raisePressure();
	}
}
