package com.itea.andrii.lecture10.lesson10.example.accountlogic;

import com.itea.andrii.lecture10.lesson10.example.annotation.BankingAnnotation;
import com.itea.andrii.lecture10.lesson10.example.annotation.SecurityLevelEnum;

public class AccountOperationManagerImpl implements AccountOperationManager {
    @Override
    @BankingAnnotation(securityLevel = SecurityLevelEnum.HIGH)
    public double depositInCash(int accountNumber, int amount) {
        return 0;
    }

    @Override
    @BankingAnnotation(securityLevel = SecurityLevelEnum.HIGH)
    public boolean withdraw(int accountNumber, int amount) {
        return true;
    }

    @Override
    @BankingAnnotation(securityLevel = SecurityLevelEnum.LOW)
    public boolean covert(int amount) {
        return true;
    }

    @Override
    @BankingAnnotation
    public boolean transfer(int accountNumber, int amount) {
        return true;
    }
}
