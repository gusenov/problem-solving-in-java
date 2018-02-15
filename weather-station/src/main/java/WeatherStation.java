public class WeatherStation {

    // Атрибуты:

    /**
     * Температура.
     */
    private double temperature;

    /**
     * Атмосферное давление.
     */
    private double atmosphericPressure;

    /**
     * Влажность.
     */
    private double humidity;

    /**
     * Конструктор.
     *
     * В конструкторе задаются атрибуты класса:
     * @param temperature  температура.
     * @param atmosphericPressure  атмосферное давление.
     * @param humidity  влажность.
     */
    public WeatherStation(double temperature, double atmosphericPressure, double humidity) {
        this.temperature = temperature;
        this.atmosphericPressure = atmosphericPressure;
        this.humidity = humidity;
    }

    // Методы для изменения атрибутов:

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getAtmosphericPressure() {
        return atmosphericPressure;
    }

    public void setAtmosphericPressure(double atmosphericPressure) {
        this.atmosphericPressure = atmosphericPressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    /**
     * @return  значения атрибутов.
     */
    public String toString() {
        return "Температура: " + this.getTemperature()
                + "°, атмосферное давление: " + this.getAtmosphericPressure()
                + " мм рт. ст., влажность: " + this.getHumidity() + "%.";
    }

    /**
     * Метод, который выводит информацию (значения атрибутов) на экран (в консоль).
     */
    public void print() {
        System.out.println(this.toString());
    }
}
