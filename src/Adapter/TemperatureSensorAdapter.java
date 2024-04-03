package Adapter;

public class TemperatureSensorAdapter implements TemperatureSensorIF {
    private TemperatureSensor sensor;

    public TemperatureSensorAdapter(TemperatureSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public double getTemperatureInFahrenheit() {
        double celsius = sensor.getTemperatureInCelsius();
        return celsiusToFahrenheit(celsius);
    }

    private double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
