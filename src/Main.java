public class Main {
    public static void main(String[] args) {
        tusk1();
        tusk2();
        tusk3();
        tusk4();
    }

    public static void tusk1() {
        System.out.println("Задание 1");
        int money = 15_000;
        int total = 0;
        int month = 1;

        while (total < 2_459_000) {
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            total = total + money;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
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
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void tusk3() {
        System.out.println("Задание 3");
        int country = 12_000_000;
        int indicator = 1000;
        int birth = 17;
        int mortality = 8;
        int year = 0;
        int result = 0;

        while (result < 10) {
            indicator = country / indicator;
            birth = indicator * birth;
            mortality = indicator * mortality;
            result = birth - mortality;
        }

        while (year < 10) {
            year++;
            country = country + result;
            System.out.println("Год " + year + ", численность населения составляет " + country);
        }
        System.out.println();
    }
    public static void tusk4() {
        System.out.println("Задание 4");

    }
}