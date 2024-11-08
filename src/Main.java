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
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок.");
        System.out.println("За 1 месяц машина произвела " + bottlesIn1Month + " штук бутылок.");

        //Task5


    }
}