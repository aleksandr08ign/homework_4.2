public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int savings = 0;
        int salary = 15000;
        int h = 0;
        while (savings < 2_459_000) {
            h = h + 1;
            savings = savings + salary;
            System.out.println("Месяц " + h + ", сумма накоплений равна " + savings);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int ten = 1;
        while (ten < 11) {
            System.out.print(ten + " ");
            ten = ten + 1;
        }
        System.out.println();
        for (ten = 10; ten >= 1; ten--) {
            System.out.print(ten + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int populationSize = 12_000_000;
        int birthRate = populationSize / 1000 * 17;
        int mortality = populationSize / 1000 * 8;
        int year = 1;
        while (year < 11) {
            System.out.println("Год " + year + ", численность населения составляет " + populationSize);
            year = year + 1;
            populationSize = populationSize + birthRate - mortality;
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int salary4 = 15_000;
        int savings4 = 0;
        int h4 = 0;
        while (savings4 < 12_000_000) {
            h4 = h4 + 1;
            savings4 = savings4 + (savings4 / 100 * 7);
            savings4 = salary4 + savings4;
            System.out.println("Месяц " + h4 + ", сумма накоплений равна " + savings4);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int salary5 = 15_000;
        int savings5 = 0;
        int h5 = 0;
        while (savings5 < 12_000_000) {
            h5 = h5 + 1;
            savings5 = savings5 + (savings5 / 100 * 7);
            savings5 = salary5 + savings5;
            if (h5 % 6 == 0)
                System.out.println("Месяц " + h5 + ", сумма накоплений равна " + savings5);
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int salary6 = 15_000;
        int savings6 = 0;
        int h6 = 0;
        while (h6 < 9 * 12) {
            h6 = h6 + 1;
            savings6 = savings6 + (savings6 / 100 * 7);
            savings6 = salary6 + savings6;
            if (h6 % 6 == 0)
                System.out.println("Месяц " + h6 + ", сумма накоплений равна " + savings6);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 3;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday = friday + 7;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int currentYear = 2023;
        int start = 0;
        int beginningOfThePeriod = currentYear - 200;
        int finish = currentYear + 100;
        while (start < finish) {
            start = start + 79;
            if (start > beginningOfThePeriod && start < finish)
                System.out.println(start);
        }
    }
}