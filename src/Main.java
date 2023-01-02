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
        byte apple = 1;
        System.out.println("переменная с типом byte " + apple);
        short days = 365;
        System.out.println("переменная с типом short " + days);
        int year = 2023;
        System.out.println("переменная с типом int " + year);
        long money = 1250000L;
        System.out.println("переменная с типом long " + money);
        float weight = 72.5f;
        System.out.println("переменная с типом float " + weight);
        double distance = 307.358;
        System.out.println("переменная с типом double " + distance);

    }

    public static void task2() {
        System.out.println("Задача 2");
        float variable1 = 27.12f;
        System.out.println("переменная 1 " + variable1);
        long variable2 = 987678965549L;
        System.out.println("переменная 2 " + variable2);
        double variable3 = 2.786;
        System.out.println("переменная 3 " + variable3);
        short variable4 = 569;
        System.out.println("переменная 4 " + variable4);
        int variable5 = 27897;
        System.out.println("переменная 5 " + variable5);
        byte variable6 = 67;
        System.out.println("переменная 6 " + variable6);
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte studentsLP = 23;
        System.out.println("У Людмилы Павловны - " + studentsLP + " ученика");
        byte studentsAS = 27;
        System.out.println("У Анны Сергеевны - " + studentsAS + " учеников");
        byte studentsEA = 30;
        System.out.println("У Екатерины Андреевны - " + studentsEA + " учеников");
        short totalPaper = 480;
        System.out.println("Всего закупили " + totalPaper + " листов бумаги");
        int totalStudents = studentsAS + studentsEA + studentsLP;
        System.out.println("Всего учеников - " + totalStudents);
        int forEveryone = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + forEveryone + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte volume = 16;
        byte time = 2;
        byte perMinute = (byte) (volume / time);
        System.out.println("Производительность машины за 1 минуту - " + perMinute + " бутылок");
        short in20Minutes = (short) (perMinute * 20);
        System.out.println("За 20 минут машина произвела " + in20Minutes + " штук бутылок");
        short minutesPerDay = 60 * 24;
        short perDay = (short) (perMinute * minutesPerDay);
        System.out.println("За сутки машина произвела " + perDay + " штук бутылок");
        short minutesPer3Days = 60 * 24 * 3;
        int per3Days = perMinute * minutesPer3Days;
        System.out.println("За 3 дня машина произвела " + per3Days + " штук бутылок");
        int minutesPerMonth = 60 * 24 * 3 * 30;
        int perMonth = perMinute * minutesPerMonth;
        System.out.println("За 1 месяц машина произвела " + perMonth + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        short totalPaint = 120;
        short whitePaintOneClass = 2;
        short brownPaintOneClass = 4;
        int paintOneClass = whitePaintOneClass + brownPaintOneClass;
        int sumClasses = totalPaint / paintOneClass;
        int sumWhite = sumClasses * whitePaintOneClass;
        int sumBrown = sumClasses * brownPaintOneClass;
        System.out.println("В школе, где " + sumClasses + " классов, нужно " + sumWhite + " банок белой краски и " + sumBrown +
                " банок коричневой краски.");
    }
    public static void task6() {
        System.out.println("Задача 6");
        short bananes = 5;
        short weightBanane = 80;
        short weightBananes = (short) (bananes * weightBanane);
        short milk = 2;
        short weight100Milk = 105;
        short weightMilk = (short) (milk * weight100Milk);
        short icecream = 2;
        short weight1Icecream = 100;
        short weightIcecream = (short) (icecream * weight1Icecream);
        short eggs = 4;
        short weightnEgg = 70;
        short weightEggs = (short) (eggs * weightnEgg);
        short weightBreakfast = (short) (weightBananes + weightMilk + weightIcecream + weightEggs);
        System.out.println("Вес завтрака в граммах - " + weightBreakfast + " г");
        short grPerKg = 1000;
        float weightKg = weightBreakfast/(float)grPerKg;
        System.out.println("Вес завтрака в килограммах - " + weightKg + " кг");
    }
    public static void task7() {
        System.out.println("Задача 7");
        short loseWeightKg = 7;
        int loseWeightG = loseWeightKg * 1000;
        short losePerDay = 250;
        int days1 = loseWeightG/losePerDay;
        System.out.println(days1 + " дней уйдет на похудение, если спортсмен каждый день будет терять по 250 грамм;");
        short losePerDay2 = 500;
        int days2 = loseWeightG/losePerDay2;
        System.out.println(days2 + " дней уйдет на похудение, если спортсмен каждый день будет терять по 250 грамм;");
        int mean = (days1 + days2) / 2;
        System.out.println(mean + " день в среднем уйдет на похудение.");
    }
    public static void task8() {
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int anannualSalaryMasha = salaryMasha * 12;
        int anannualSalaryDenis = salaryDenis * 12;
        int anannualSalaryKristina = salaryKristina * 12;
        float increasedSalarysalaryMasha = salaryMasha * 1.1f;
        float increasedAnannualSalarysalaryMasha = increasedSalarysalaryMasha * 12;
        float differenceMasha = increasedAnannualSalarysalaryMasha -  anannualSalaryMasha;
        System.out.println("Маша теперь получает " + increasedSalarysalaryMasha + " рублей. Годовой доход вырос на "
        + differenceMasha + " рублей.");
        float increasedSalarysalaryDenis = salaryDenis * 1.1f;
        float increasedAnannualSalarysalaryDenis = increasedSalarysalaryDenis * 12;
        float differenceDenis = increasedAnannualSalarysalaryDenis -  anannualSalaryDenis;
        System.out.println("Денис теперь получает " + increasedSalarysalaryDenis + " рублей. Годовой доход вырос на "
                + differenceDenis + " рублей.");
        float increasedSalarysalaryKristina = salaryKristina * 1.1f;
        float increasedAnannualSalarysalaryKristina = increasedSalarysalaryKristina * 12;
        float differenceKristina = increasedAnannualSalarysalaryKristina -  anannualSalaryKristina;
        System.out.println("Кристина теперь получает " + increasedSalarysalaryKristina + " рублей. Годовой доход вырос на "
                + differenceKristina + " рублей.");
    }
}