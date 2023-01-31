package com.itea.andrii.lecture7.hometask7;

public enum TemperatureUnit implements Convertible<TemperatureUnit> {
    CELSIUS {

        /**
         * Converts Celsium to Kelvin, Fahrenheit or Celsius
         * @param temperatureUnit System to convert to. (Kelvin, Fahrenheit or Celsius)
         * @return Converted temperature to Kelvin, Fahrenheit or Celsius
         */
        @Override
        public TemperatureUnit convert(TemperatureUnit temperatureUnit) {
            switch (temperatureUnit) {
                case KELVIN -> temperatureUnit.setDegrees(getDegrees() + 273.15);
                case FAHRENHEIT -> temperatureUnit.setDegrees((getDegrees() * 1.8) + 32);
                case CELSIUS -> temperatureUnit.setDegrees(getDegrees());
            }
            return temperatureUnit;
        }
    },

    FAHRENHEIT {

        /**
         * Converts Fahrenheit to Kelvin, Celsius or Fahrenheit
         * @param temperatureUnit System to convert to. (Kelvin, Fahrenheit or Celsius)
         * @return Converted temperature to Kelvin, Fahrenheit or Celsius
         */
        @Override
        public TemperatureUnit convert(TemperatureUnit temperatureUnit) {
            switch (temperatureUnit) {
                case CELSIUS -> temperatureUnit.setDegrees((getDegrees() - 32) / 1.8);
                case KELVIN -> temperatureUnit.setDegrees((getDegrees() + 459.67) * 5 / 9);
                case FAHRENHEIT -> temperatureUnit.setDegrees(getDegrees());
            }
            return temperatureUnit;
        }
    },
    KELVIN {

        /**
         * Converts Kelvin to Kelvin, Celsius or Fahrenheit
         * @param temperatureUnit System to convert to. (Kelvin, Fahrenheit or Celsius)
         * @return Converted temperature to Kelvin, Fahrenheit or Celsius
         */
        @Override
        public TemperatureUnit convert(TemperatureUnit temperatureUnit) {
            switch (temperatureUnit) {
                case CELSIUS -> temperatureUnit.setDegrees(getDegrees() - 273.15);
                case FAHRENHEIT -> temperatureUnit.setDegrees((getDegrees() - 273.15) * 1.8 + 32);
                case KELVIN -> temperatureUnit.setDegrees(getDegrees());
            }
            return temperatureUnit;
        }
    };


    private double degrees;
    public double getDegrees() {
        return degrees;
    }

    public void setDegrees(double degrees) {
        this.degrees = degrees;
    }
}
