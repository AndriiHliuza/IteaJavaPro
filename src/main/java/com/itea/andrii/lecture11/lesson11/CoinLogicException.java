package com.itea.andrii.lecture11.lesson11;

public class CoinLogicException extends CoinException {
    public CoinLogicException() {
    }

    public CoinLogicException(String message) {
        super(message);
    }

    public CoinLogicException(String message, Throwable cause) {
        super(message, cause);
    }

    public CoinLogicException(Throwable cause) {
        super(cause);
    }
}
