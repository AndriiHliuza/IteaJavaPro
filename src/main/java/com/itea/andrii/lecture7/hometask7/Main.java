package com.itea.andrii.lecture7.hometask7;

public class Main {
    public static void main(String[] args) {
        System.out.println("------Конвертатори з Кельвіна------");
        // Конвертор з Кельвіна в Фаренгейт
        BaseConverter kelvinToFahrenheitConverter = new BaseConverter(TemperatureUnit.KELVIN, TemperatureUnit.FAHRENHEIT);
        System.out.printf("%.2f\n", kelvinToFahrenheitConverter.convert(32.0));
        // Конвертор з Кельвіна в Цельсій
        BaseConverter kelvinToCelsiusConverter = new BaseConverter(TemperatureUnit.KELVIN, TemperatureUnit.CELSIUS);
        System.out.printf("%.2f\n", kelvinToCelsiusConverter.convert(32.0));

        System.out.println("------Конвертатори з Фаренгейту------");
        // Конвертор з Фаренгейта в Цельсій
        BaseConverter fahrenheitToCelsiusConverter = new BaseConverter(TemperatureUnit.FAHRENHEIT, TemperatureUnit.CELSIUS);
        System.out.printf("%.2f\n", fahrenheitToCelsiusConverter.convert(20.0));
        // Конвертор Фаренгейта в Кельвін
        BaseConverter fahrenheitToKelvinConverter = new BaseConverter(TemperatureUnit.FAHRENHEIT, TemperatureUnit.KELVIN);
        System.out.printf("%.2f\n", fahrenheitToKelvinConverter.convert(20.0));

        System.out.println("------Конвертатори з Цельсію------");
        // Конвертор з Цельсія в Фаренгейт
        BaseConverter celsiusToFahrenheitConverter = new BaseConverter(TemperatureUnit.CELSIUS, TemperatureUnit.FAHRENHEIT);
        System.out.printf("%.2f\n", celsiusToFahrenheitConverter.convert(20.0));
        // Конвертор Фаренгейта в Кельвін
        BaseConverter celsiusToKelvinConverter = new BaseConverter(TemperatureUnit.CELSIUS, TemperatureUnit.KELVIN);
        System.out.printf("%.2f\n", celsiusToKelvinConverter.convert(20.0));
    }
}
