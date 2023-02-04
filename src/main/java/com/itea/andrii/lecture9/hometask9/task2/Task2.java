package com.itea.andrii.lecture9.hometask9.task2;

public class Task2 {
    public static void main(String[] args) {
        Payment payment = new Payment();

        System.out.println("-------Доступні категорії товарів та їх товари-------");
        System.out.println(payment.getAllAvailableProducts());

        System.out.println("Товар додано: " + payment.addProductToPurchase("Молоко", "dairy"));
        System.out.println("Товар додано: " + payment.addProductToPurchase("хліб", "baked"));
        System.out.println("Товар додано: " + payment.addProductToPurchase("Сметана", "fruit"));
        System.out.println("Товар додано: " + payment.addProductToPurchase("dbsnd", "fruit"));
        System.out.println("Товар додано: " + payment.addProductToPurchase("Яблуки", "dgdge"));
        System.out.println("Товар додано: " + payment.addProductToPurchase("буряки", "vegetable"));

        System.out.println("-------Всі вибрані товари-------");
        System.out.println(payment.getAllPurchaseProducts());
        System.out.println("Сума до сплати: " + payment.getPriceToPay() + "грн.");

        System.out.println("Проплата пройшла успішно: " + payment.pay(360));
        int productToRemove = 2;
        System.out.println("Вилучення " + productToRemove + "-го товару пройшло успішно: " + payment.removeProduct(productToRemove));

        System.out.println("-------Всі вибрані товари-------");
        System.out.println(payment.getAllPurchaseProducts());
        System.out.println("Сума до сплати: " + payment.getPriceToPay() + " грн.");

        System.out.println("Проплата пройшла успішно: " + payment.pay(360));

        System.out.println("Решта з заплаченої суми становить: " + payment.getRest() + " грн.");
    }
}
