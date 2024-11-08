public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //Task1
        int cat = 1000000000;
        System.out.println(cat);
        byte dog = 100;
        System.out.println(dog);
        short horse = 10000;
        System.out.println(horse);
        long time = 1000000000000000000L;
        System.out.println(time);
        float age = 1.1231231231F;
        System.out.println(age);
        double cup = 2.321321321;
        System.out.println(cup);

        //Task2
        float a = 21.12f;
        long  b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short i = 27897;
        byte  f = 67;

        //Task3
        int studentsLudmila = 23;
        int studentsAnna = 27;
        int studentsEkaterina = 30;
        int totalStudents = studentsLudmila + studentsAnna + studentsEkaterina;
        int totalPaperSheets = 480;
        double sheetsPerStudent = (double) totalPaperSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано "+sheetsPerStudent+" листов бумаги" );

        //Task4
        int bottlesPer2Minutes = 16;
        int bottlesPerMinute = bottlesPer2Minutes / 2;

        int bottlesIn20Minutes = bottlesPerMinute * 20;
        int bottlesIn1Day = bottlesPerMinute * 60 * 24;
        int bottlesIn3Days = bottlesIn1Day * 3;
        int bottlesIn1Month = bottlesIn1Day * 30;

        System.out.println("За 20 минут машина произвела "+ bottlesIn20Minutes + " штук бутылок");
        System.out.println("За 1 сутки машина произвела "+ bottlesIn1Day + " штук бутылок");
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
        int totalWeightInGrams = (bananasCount * bananaWeight) +
                (int) milkWeight +
                (iceCreamCount * iceCreamWeight) +
                (eggsCount * eggWeight);
        double totalWeightInKilograms = totalWeightInGrams / 1000.0;
        System.out.println("Общий вес спортзавтрака: " + totalWeightInGrams + " грамм.");
        System.out.println("Общий вес спортзавтрака: " + totalWeightInKilograms + " килограмм.");

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

    }
}