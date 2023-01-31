package com.itea.andrii.lecture7.hometask7;

@FunctionalInterface
public interface Convertible<T> {

    /**
     * Converts T object
     * @param t type T object to convert
     * @return converted object of type T
     */
    T convert(T t);
}
