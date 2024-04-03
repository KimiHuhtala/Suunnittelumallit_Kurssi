package Adapter;

public class Main {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();
        System.out.println("Temperature in Celsius: " + sensor.getTemperatureInCelsius());

        TemperatureSensorIF sensorInFahrenheit = new TemperatureSensorAdapter(sensor);
        System.out.println("Temperature in Fahrenheit: " + sensorInFahrenheit.getTemperatureInFahrenheit());
    }
}
