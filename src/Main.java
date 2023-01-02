public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
}