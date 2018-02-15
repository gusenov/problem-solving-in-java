public class User {
    /**
     * Точка входа.
     * @param args  аргументы.
     */
    public static void main(String[] args) {
        System.out.println("Погода в Москве");  // https://yandex.ru/pogoda/moscow

        System.out.println("15 февраля 2018 года: ");
        WeatherStation moscow = new WeatherStation(-7, 760, 79);
        moscow.print();  // вывод информации (значений атрибутов) на экран (в консоль).

        System.out.println("16 февраля 2018 года: ");

        // Проверка методов класса:
        moscow.setTemperature(-3);
        moscow.setAtmosphericPressure(758);
        moscow.setHumidity(88);
        System.out.println("Температура: " + moscow.getTemperature()
                + "°, атмосферное давление: " + moscow.getAtmosphericPressure()
                + " мм рт. ст., влажность: " + moscow.getHumidity() + "%.");
    }
}
