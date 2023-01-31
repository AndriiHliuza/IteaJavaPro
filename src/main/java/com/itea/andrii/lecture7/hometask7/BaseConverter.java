package com.itea.andrii.lecture7.hometask7;

public class BaseConverter implements Convertible<Double> {

    private final TemperatureUnit baseTemperatureUnit;
    private final TemperatureUnit finalTemperatureUnit;

    public BaseConverter(TemperatureUnit baseTemperatureUnit, TemperatureUnit finalTemperatureUnit) {
        this.baseTemperatureUnit = baseTemperatureUnit;
        this.finalTemperatureUnit = finalTemperatureUnit;
    }


    /**
     * Converts degrees from baseTemperature system to finalTemperature system
     * @param degrees degrees in baseTemperature system
     * @return degrees in finalTemperature system
     */
    @Override
    public Double convert(Double degrees) {
        baseTemperatureUnit.setDegrees(degrees);
        return baseTemperatureUnit.convert(finalTemperatureUnit).getDegrees();
    }
}
