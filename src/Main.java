public class Main {
    public static void main(String[] args) {

        int a = 40000;
        byte b = 22;
        short c = 12000;
        long d = 32000000;
        float e = 3.75f;
        double f = 4.12257689;

        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

        float g = 27.12f;
        long h = 987678965549L;
        short i = 2786;
        short j = 569;
        short k = -159;
        short l = 27897;
        byte m = 67;

        byte lPstudents = 23;
        byte aSstudents = 27;
        byte eAstudents = 30;
        short totalPapers = 480;
        int paperForStudents = totalPapers / (lPstudents + aSstudents + eAstudents);
        System.out.println("На каждого ученика рассчитано " + paperForStudents + " листов бумаги");

        byte productivityPerMinute = 16 /2;
        int productivityPerDay = productivityPerMinute * 24 * 60;
        int productivityPerMonth = productivityPerDay * 30;
        System.out.println("За 20 минут машина произвела " + productivityPerMinute * 20  + " штук бутылок");
        System.out.println("За сутки машина произвела " + productivityPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productivityPerDay * 3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + productivityPerMonth + " штук бутылок");


        byte totalClasses = 120 / (2 + 4);
        int whitePaint = totalClasses * 2;
        int brownPaint = totalClasses * 4;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");


        short weightBananas = 5 * 80;
        short weightMilk = 2 * 105;
        short weightIceCream = 2 * 100;
        short weightEggs = 4 * 70;
        float weightBreakfast = weightBananas + weightMilk + weightIceCream + weightEggs;
        float weightBreakfastInKg = weightBreakfast / 1000;
        System.out.println("Вес такого спортзавтрака " + weightBreakfast + " грамм, или " + weightBreakfastInKg + " кг");

        float daysMin = (float) (7 / 0.5);
        float daysMax = (float) (7 / 0.250);
        byte daysAverage = (byte) ((daysMin + daysMax) /2);
        System.out.println("При похудении на 250г в день потребуется " + (byte)(daysMax) + " дней, при похудении на 500г в день потребуется " + (byte)(daysMin) + " дней. В среднем же потребуется " + daysAverage + " дней.");


        int mashaZp = 67760;
        int denisZP = 83690;
        int kristinaZp = 76230;
        int mashaNewZp = mashaZp + (mashaZp / 10);
        int denisNewZP = denisZP + (denisZP / 10);
        int kristinaNewZp = kristinaZp + (kristinaZp / 10);
        int oldZpMashaPerYear = mashaZp * 12;
        int oldZpDenisPerYear = denisZP * 12;
        int oldZpKristinaPerYear = kristinaZp * 12;
        int newZpMashaPerYear = mashaNewZp * 12;
        int newZpDenisPerYear = denisNewZP * 12;
        int newZpKristinaPerYear = kristinaNewZp * 12;
        System.out.println("Маша теперь получает " + mashaNewZp + " рублей. Годовой доход вырос на " + (newZpMashaPerYear - oldZpMashaPerYear) + " рублей");
        System.out.println("Денис теперь получает " + denisNewZP + " рублей. Годовой доход вырос на " + (newZpDenisPerYear - oldZpDenisPerYear) + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNewZp + " рублей. Годовой доход вырос на " + (newZpKristinaPerYear - oldZpKristinaPerYear) + " рублей");
    }
}