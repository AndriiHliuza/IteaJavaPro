package com.itea.andrii.lecture10.lesson10.example.accountlogic;

public interface AccountOperationManager {
    double depositInCash(int accountNumber, int amount);
    boolean withdraw(int accountNumber, int amount);
    boolean covert(int amount);
    boolean transfer(int accountNumber, int amount);
}
