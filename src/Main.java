import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        tusk1();
        tusk2();
        tusk3();
        tusk4();
        tusk5();
        tusk6();
        tusk7();
        tusk8();
    }

    public static void tusk1() {
        System.out.println("Задание 1");
        int money = 15_000;
        int total = 0;
        int month = 1;

        while (total < 2_459_000) {
            total += money + total * 0.01;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month++;
        }
        System.out.println();
    }

    public static void tusk2() {
        System.out.println("Задание 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void tusk3() {
        System.out.println("Задание 3");
        int country = 12_000_000;
        int birth = 17;
        int mortality = 8;
        double mortalityCoefficient = mortality / 1000d;
        double birthCoefficient = birth / 1000d;

        for (int i = 1; i <= 10; i++) {
            int indicator = (int) (country * birthCoefficient - country * mortalityCoefficient);
            country = country + indicator;
            System.out.println("Год " + i + ", численность населения составляет " + country);
        }
        System.out.println();
    }

    public static void tusk4() {
        System.out.println("Задание 4");
        double deposit = 15_000;
        int month = 1;
        while (deposit < 12_000_000) {
            deposit = deposit + deposit * 0.07;
            System.out.printf(Locale.US, "Месяц " + month + ", сумма накоплений %.2f%n", deposit);
            month++;
        }
        System.out.println();
    }

    public static void tusk5() {
        System.out.println("Задание 5");
        double deposit = 15_000;
        int month = 1;
        while (deposit < 12_000_000) {
            deposit = deposit + deposit * 0.07;
            if (month % 6 == 0) {
                System.out.printf(Locale.US, "Месяц " + month + ", сумма накоплений %.2f%n", deposit);
            }
            month++;
        }
        System.out.println();
    }

    public static void tusk6() {
        System.out.println("Задание 6");
        double deposit = 15_000;
        int month = 1;
        while (month <= 108) {
            deposit = deposit + deposit * 0.07;
            if (month % 6 == 0) {
                System.out.printf(Locale.US, "Месяц " + month + ", сумма накоплений %.2f%n", deposit);
            }
            month++;
        }
        System.out.println();
    }

    public static void tusk7() {
        System.out.println("Задание 7");
        int friday = 6;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет!");
            friday += 7;
        }
        System.out.println();
    }

    public static void tusk8() {
        System.out.println("Задание 8");
        int now = 2023;
        int previous = now - 200;
        int next = now + 100;
        for (int i = previous; i <= next; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}