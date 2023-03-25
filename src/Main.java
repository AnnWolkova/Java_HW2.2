package main;

public class Main {
    public static void main(String[] args) {

        int initial = 300;              // начальная сумма
        int summ = 1050;                // сумма пополнения
        int bonus = summ / 100;         // расчёт суммы бонуса
        int finishSumm;

        if (summ > 1000) {
            finishSumm = bonus + initial + summ;
        } else {
            finishSumm = initial + summ;
        }
        System.out.println("Бонус равен: "+bonus);
        System.out.println("Итоговая сумма равна: "+finishSumm);
    }
}