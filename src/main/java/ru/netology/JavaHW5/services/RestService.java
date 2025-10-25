package ru.netology.JavaHW5.services;

public class RestService {
    public int calculate(int income, int expenses, int threshold) {
        int restMonth = 0;
        int money = 0;
        for (int month = 1; month < 13; month++) {
            if (money >= threshold) {
                restMonth++;
                money = (money - expenses)/3;
                System.out.println("Отдых. Остаток денег в этом месяце с учетом трат = " + money);
            } else {
                money = money + income - expenses;
                System.out.println("Придется работать. Остаток денег в этом месяце с учетом трат = " + money);
            }
        }
        return restMonth;
    }
}
