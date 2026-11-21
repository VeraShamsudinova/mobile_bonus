package ru.netology;

public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int payment = 300;
        int bonus = 0;

        if (payment > 1000) {
            bonus = payment / 100;
        }

        int totalBalance = balance + payment + bonus;

        System.out.println("Бонусы: " + bonus);
        System.out.println("Итоговый баланс: " + totalBalance);
    }
}