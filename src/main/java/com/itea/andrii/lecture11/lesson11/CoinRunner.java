package com.itea.andrii.lecture11.lesson11;

public class CoinRunner {
    public void doAction(String value) throws CoinTechnicalException {
        Coin ob = new Coin();
        try {
            double d = Double.parseDouble(value);
            ob.setDiameter(d);
        } catch (NumberFormatException e) {
            throw new CoinTechnicalException("incorrect symbol in string");
        } catch (CoinLogicException e) {
            System.err.println(e.getCause());
        }
    }

    public static void main(String[] args) {
        try {
            new CoinRunner().doAction("gerge");
        } catch (CoinTechnicalException e) {
            throw new RuntimeException(e);
        }
    }
}
