package com.itea.andrii.lecture11.lesson11;

public class CoinTechnicalException extends CoinException{
    public CoinTechnicalException() {
    }

    public CoinTechnicalException(String message) {
        super(message);
    }

    public CoinTechnicalException(String message, Throwable cause) {
        super(message, cause);
    }

    public CoinTechnicalException(Throwable cause) {
        super(cause);
    }
}
