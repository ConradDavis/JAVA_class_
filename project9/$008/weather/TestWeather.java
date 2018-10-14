package $008.weather;

public class TestWeather {

	public static void main(String[] args) {
		WeatherData data = new WeatherData(5);
		CurrentDisplay display1 = new CurrentDisplay();
		StatisticsDisplay display2 = new StatisticsDisplay();
		ForcastDisplay display3 = new ForcastDisplay();
		
		data.register(display1);
		data.register(display2);
		data.register(display3);
		
		data.remove(display2);
		
		data.changed();
		
		

	}

}
