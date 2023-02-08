package com.itea.andrii.lecture11.lesson11;

public class CoinException extends Exception {
    public CoinException() {
    }

    public CoinException(String message) {
        super(message);
    }

    public CoinException(String message, Throwable cause) {
        super(message, cause);
    }

    public CoinException(Throwable cause) {
        super(cause);
    }
}
