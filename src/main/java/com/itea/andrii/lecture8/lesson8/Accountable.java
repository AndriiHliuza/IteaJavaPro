package com.itea.andrii.lecture8.lesson8;

public interface Accountable<T> {
    T getId();
    int getSum();
    void setSum(int sum);
}
