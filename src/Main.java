//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // задание 1
        int firstFriday = 3;
        for (int i = 1; i <= 31; i++) {
            if ((i - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }

        // задание 2, вариант 1
        int dist = 0;
        int distMar = 42195;
        int distOst = 0;
        do {
            distOst = distMar - dist;
            System.out.println("Держись! осталось " + distOst + " метров");
            dist = dist + 500;
        } while (dist < distMar);

        // задание 2, вариант 2
        dist = 0;
        distMar = 42195;
        distOst = 0;
        for (; dist < distMar; dist = dist + 500) {
            distOst = distMar - dist;
            System.out.println("Держись! осталось " + distOst + " метров");
        }

        //задание 3, вариант 1
        int day = 0;
        int summa = 590;
        while (summa > 99) {
            day++;
            if (day % 5 == 0) {
                continue;
            }
            summa = summa - 100;
        }
        System.out.println("Суммы хватит на " + day + " дней стоянки");

        //задание 3, вариант 2
        day = 0;
        summa = 490;
        for (; summa > 99; ) {
            day++;
            if (day % 5 == 0) {
                continue;
            }
            summa = summa - 100;
        }
        System.out.println("Суммы хватит на " + day + " дней стоянки");

        //задание 4
        int month = 0;
        int total = 0;
        while (true) {
            month++;
            if (month % 6 == 0) {
                total = total + (total / 100) * 7;
            }
            total = total + 15000;
            System.out.println("Месяц " + month + " накопления " + total);
            if (total > 12_000_000) {
                break;
            }

        }

        //задание 5
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100 && overheats < 3) {
            minute++;
            if (minute % 10 == 0) {
                System.out.println("Перегрев на " + minute + " минуте зарядки");
                overheats++;
                minute = minute + 2;
                continue;
            }
            charge = charge + 2;
        }
        System.out.println("Время зарядки составило " + minute + " минут");


    }
}