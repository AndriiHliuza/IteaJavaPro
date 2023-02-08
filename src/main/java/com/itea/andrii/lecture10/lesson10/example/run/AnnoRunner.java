package com.itea.andrii.lecture10.lesson10.example.run;

import com.itea.andrii.lecture10.lesson10.example.accountlogic.AccountOperationManager;
import com.itea.andrii.lecture10.lesson10.example.accountlogic.AccountOperationManagerImpl;
import com.itea.andrii.lecture10.lesson10.example.logic.SecurityFactory;

public class AnnoRunner {
    public static void main(String[] args) {
        AccountOperationManager account = new AccountOperationManagerImpl();
        AccountOperationManager securityAccount = SecurityFactory.createSecurityObject(account);

        securityAccount.depositInCash(2347818, 98411);
        securityAccount.withdraw(3535, 36345);
        securityAccount.covert(2736);
        securityAccount.transfer(23476, 372648);
    }
}
