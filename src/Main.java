public class Main {
    public static void main(String[] args) {
        System.out.println("задача № 1");
        int a = 465;
        System.out.println("Значение переменной a " + " тип int "+"равно" + a);
        byte b = 56;
        System.out.println("Значение переменной b " + " тип byte "+"равно" + b);
        short s = -138;
        System.out.println("Значение переменной s " + " тип short "+"равно" + s);
        long d = 253658796541L;
        System.out.println("Значение переменной d " + " тип long "+"равно" + d);
        float i = (float) 5.69;
        System.out.println("Значение переменной i " + " тип float  "+"равно" + i);
        double f = 2.565896587458;
        System.out.println("Значение переменной f " + " тип double  "+"равно" + f);

        System.out.println("задача № 2");
        float k = (float) 27.12;
        System.out.println("Значение переменной k " + " тип float  "+"равно" + k);
        long m = 987678965549L;
        System.out.println("Значение переменной m " + " тип long "+"равно" + m);
        float j = (float) 2.786;
        System.out.println("Значение переменной j " + " тип float  "+"равно" + j);
        int p = 569;
        System.out.println("Значение переменной p " + " тип int "+"равно" + p);
        short w = -159;
        System.out.println("Значение переменной w " + " тип short "+"равно" + w);
        int n = 27897;
        System.out.println("Значение переменной n " + " тип int "+"равно" + n);
        byte c = 67;
        System.out.println("Значение переменной c " + " тип byte "+"равно" + c);

        System.out.println("задача № 3");
        byte LyudmilaPavlovna = 23;
        byte AnnaSergeevna = 27;
        byte EkaterinaAndreevna = 30;
        int purchased = 480;
        byte sheet = 77;
        System.out.println(LyudmilaPavlovna+AnnaSergeevna+EkaterinaAndreevna);
        System.out.println(purchased /LyudmilaPavlovna+AnnaSergeevna+EkaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано" + sheet + "листов бумаги");

        System.out.println("задача № 4");
        byte bottle = 16;
        byte minutes = 2;
        System.out.println(bottle/minutes);
        System.out.println("За 1 минуту машина произвела 8 штук бутылок");
        byte oneMinute = 8;
        int efficiency = oneMinute * 20;
        System.out.println("За 20 минуту машина произвела"+efficiency +"штук бутылок");
        byte oneHour = 60;
        int watch = oneHour  * 24;
        System.out.println("В сутках"+watch +"часов");
        int perDay = oneMinute * 1440;
        System.out.println("За сутки  машина произвела"+perDay +"штук бутылок");
        int threeDays = perDay * 3;
        System.out.println("За  3 суток  машина произвела"+threeDays +"штук бутылок");
        long month = perDay * 43200L;
        System.out.println("За  месяц   машина произвела"+month +"штук бутылок");

        System.out.println("задача № 5");
        int schoolRenovation = 120;
        byte brownPaint = 4;
        byte whitePaint = 2;
        System.out.println(brownPaint + whitePaint);
        byte forOneClass = 6;
        int totalClasses = schoolRenovation /6;
        System.out.println("всего классов в школе" + totalClasses);
        System.out.println("коричневой краски использовали"+ brownPaint * totalClasses+ "банок");
        System.out.println("белой краски использовали"+ whitePaint * totalClasses+ "банок");
        System.out.println("в школе где "+ totalClasses + "классов,нужно" + whitePaint * totalClasses +"банок белой краски и" + brownPaint * totalClasses + "банок коричневой краски");

        System.out.println("задача № 6");
        byte bananas = 5;
        byte oneBanana = 80;
        int milk = 200;
        byte oneHundredMilliliters = 105;
        int milkInGrams = oneHundredMilliliters * 2;
        System.out.println(milkInGrams);
        byte IceCreamSundae = 2 ;
        int briquette = IceCreamSundae * 100;
        System.out.println(briquette);
        byte RawEggs = 4;
        byte oneEgg = 70;
        int totalGramsOfEggs = RawEggs * oneEgg;
        System.out.println(totalGramsOfEggs);
        System.out.println(bananas*oneBanana+milkInGrams+briquette+totalGramsOfEggs);
        float sportsBreakfast = (float) 1.090;

        System.out.println("задача № 7");
        byte reset= 7;
        int grams = reset * 1000;
        System.out.println(grams);
        float days = grams / 250;
        System.out.println(days);
        int days2= grams/500;
        System.out.println(days2);
        float averageValue = days - days2 / 2;
        System.out.println(averageValue );

        System.out.println("задача № 8");
        int MashaGets = 67760;
        int DenisGets = 83690;
        int KristinaGets = 76230;
        int MashaUp = MashaGets / 100*10;
        int DenisUp = DenisGets / 100*10;
        int KristinaUp = KristinaGets / 100*10;
        int MashaNew = MashaUp + MashaGets;
        int DenisNew = DenisUp + DenisGets;
        int KristinaNew = KristinaUp +KristinaGets;
        int MashaYearUp = MashaNew * 12;
        int DenisYearUp = DenisNew * 12;
        int KristinaYearUp = KristinaNew * 12;
        System.out.println("Маша теперь получает" + MashaNew + "рублей. Годовой доход вырос на" + MashaYearUp + "рублей");
        System.out.println("Денис теперь получает" + DenisNew + "рублей. Годовой доход вырос на" + DenisYearUp + "рублей");
        System.out.println("Кристина теперь получает" + KristinaNew + "рублей. Годовой доход вырос на" + KristinaYearUp + "рублей");

    }
}