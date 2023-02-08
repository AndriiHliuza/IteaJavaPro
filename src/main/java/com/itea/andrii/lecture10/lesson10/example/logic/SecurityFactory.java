package com.itea.andrii.lecture10.lesson10.example.logic;

import com.itea.andrii.lecture10.lesson10.example.accountlogic.AccountOperationManager;
import com.itea.andrii.lecture10.lesson10.example.annotation.BankingAnnotation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityFactory {
    public static AccountOperationManager createSecurityObject(AccountOperationManager targetObject) {
        return (AccountOperationManager) Proxy.newProxyInstance(
                targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),
                new SecurityInvocationHandler(targetObject)
        );
    }

    private static class SecurityInvocationHandler implements InvocationHandler {
        private Object targetObject;

        public SecurityInvocationHandler(Object targetObject) {
            this.targetObject = targetObject;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            SecurityLogic logic = new SecurityLogic();
            Class<?>[] b = (Class<?>[]) method.getGenericParameterTypes();
            for (Class<?> c : b) {
                System.out.println(c);
            }
            Class<?>[] d = new Class[]{
                    int.class,
                    int.class
            };
            System.out.println("Hello World: " + int.class);
            for (Class<?> c : d) {
                System.out.println(c);
            }
            System.out.println(method);
            Method realMethod = targetObject.getClass().getMethod(method.getName(),
                    (Class<?>[]) method.getGenericParameterTypes());
            System.out.println(realMethod);
            BankingAnnotation annotation = realMethod.getAnnotation(BankingAnnotation.class);

            if (annotation != null) {
                logic.onInvoke(annotation.securityLevel(), realMethod, args);
                try {
                    return method.invoke(targetObject, args);
                } catch (InvocationTargetException e) {
                    System.out.println(annotation.securityLevel());
                    throw e.getCause();
                }
            } else {
                return null;
            }
        }
    }
}
