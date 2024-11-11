public class Main {
    public static void main(String[] args) {

        //Task1
        int cat = 10;
        byte dog = 5;
        short horse = 100;
        long time = 1000000L;
        float age = 3.14f;
        double cup = 3.14159;

        System.out.println("Значение переменной myVariableInt с типом int равно " + cat);
        System.out.println("Значение переменной myVariableByte с типом byte равно " + dog);
        System.out.println("Значение переменной myVariableShort с типом short равно " + horse);
        System.out.println("Значение переменной myVariableLong с типом long равно " + time);
        System.out.println("Значение переменной myVariableFloat с типом float равно " + age);
        System.out.println("Значение переменной myVariableDouble с типом double равно " + cup);

        //Task2
        double a = 27.12;
        long b = 987_678_965_549L;
        float c = 2.786f;
        int d = 569;
        short e = -159;
        int i = 27897;
        byte f = 67;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(i);
        System.out.println(f);

        //Task3
        int studentsLudmila = 23;
        int studentsAnna = 27;
        int studentsEkaterina = 30;
        int totalPaperSheets = 480;
        int totalStudents = studentsLudmila + studentsAnna + studentsEkaterina;
        int sheetsPerStudent = totalPaperSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");


        //Task4
        int bottlesPer2Minutes = 16;
        int bottlesPerMinute = bottlesPer2Minutes / 2;

        int bottlesIn20Minutes = bottlesPerMinute * 20;
        int bottlesIn1Day = bottlesPerMinute * 60 * 24;
        int bottlesIn3Days = bottlesIn1Day * 3;
        int bottlesIn1Month = bottlesIn1Day * 30;

        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок");
        System.out.println("За 1 сутки машина произвела " + bottlesIn1Day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesIn1Month + " штук бутылок");

        //Task5
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;

        int cansPerClass = whiteCansPerClass + brownCansPerClass;
        int numberOfClasses = totalCans / cansPerClass;
        int totalWhiteCans = numberOfClasses * whiteCansPerClass;
        int totalBrownCans = numberOfClasses * brownCansPerClass;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        //Task6
        int bananasCount = 5;
        int bananaWeight = 80;
        int milkVolume = 200;
        double milkWeight100ml = 105;
        double milkWeight = (milkVolume / 100.0) * milkWeight100ml;
        int iceCreamCount = 2;
        int iceCreamWeight = 100;
        int eggsCount = 4;
        int eggWeight = 70;
        int totalG = (bananasCount * bananaWeight) + (int) milkWeight + (iceCreamCount * iceCreamWeight) + (eggsCount * eggWeight);
        double totalK = totalG / 1000.0;
        System.out.println("Общий вес спортзавтрака: " + totalG + " грамм.");
        System.out.println("Общий вес спортзавтрака: " + totalK + " килограмм.");

        //Task7
        double weightG = 7000;
        double lossPerDayMin = 250;
        double lossPerDayMax = 500;
        double daysToLoseMin = weightG / lossPerDayMax;
        double daysToLoseMax = weightG / lossPerDayMin;
        double averageDays = (daysToLoseMin + daysToLoseMax) / 2;

        System.out.println("для похудения при потере 250 г в день: " + daysToLoseMax + " дней.");
        System.out.println("для похудения при потере 500 г в день: " + daysToLoseMin + " дней.");
        System.out.println("Среднее количество дней для достижения результата: " + averageDays + " дней.");

        //Task8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        double increase = 0.1;

        int newSalaryMasha = (int) (salaryMasha * (1 + increase));
        int newSalaryDenis = (int) (salaryDenis * (1 + increase));
        int newSalaryKristina = (int) (salaryKristina * (1 + increase));

        int yearlyDifferenceMasha = (newSalaryMasha - salaryMasha) * 12;
        int yearlyDifferenceDenis = (newSalaryDenis - salaryDenis) * 12;
        int yearlyDifferenceKristina = (newSalaryKristina - salaryKristina) * 12;

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + yearlyDifferenceMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + yearlyDifferenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + yearlyDifferenceKristina + " рублей");

    }
}