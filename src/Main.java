
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int varInt          = 2147483646;
        byte varByte        = 126;
        short varShort      = 32766;
        long varLong        = 90000000000L;
        float varFloat      = 6.001f;
        double varDouble    = 9.00000000001;

        System.out.println("Значение переменной varInt    с типом Int     равно " + varInt);
        System.out.println("Значение переменной varByte   с типом Byte    равно " + varByte);
        System.out.println("Значение переменной varShort  с типом Short   равно " + varShort);
        System.out.println("Значение переменной varLong   с типом Long    равно " + varLong);
        System.out.println("Значение переменной varFloat  с типом Float   равно " + varFloat);
        System.out.println("Значение переменной varDouble с типом Double  равно " + varDouble);
        System.out.println();

        System.out.println("Задача 2");

        float varFloat_2    = 27.12f;
        long varLong_2      = 987678965549L;
        double varDouble_2  = 2.786;
        int varInt_2        = 569;
        short varShort_2    = -159;
        char varChar        = 27897;
        byte varByte_2      = 67;
        System.out.println();

        System.out.println("Задача 3");

        int studentLP = 23;
        int studentAS = 27;
        int studentEA = 30;

        int studentSum = studentLP + studentAS + studentEA;
        int paperSheets = 480;

        int sheetsForStudent = paperSheets/studentSum;
        System.out.println("На каждого ученика рассчитано " + sheetsForStudent + " листов бумаги");
        System.out.println();

        System.out.println("Задача 4");

        int makingBottlesTwoMin = 16;
        int makingBottlesOneMin = makingBottlesTwoMin/2;
        int makingBottlesTwentyMin = makingBottlesOneMin * 20;
        int makingBottlesOneDay = makingBottlesTwentyMin * 3 * 24;
        int makingBottlesThreeDay = makingBottlesOneDay * 3;
        int makingBottlesOneMonth = makingBottlesThreeDay * 10;


        System.out.println("За 20 минут машина произвела " + makingBottlesTwentyMin + " штук бутылок");
        System.out.println("За сутки машина произвела " + makingBottlesOneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + makingBottlesThreeDay + " штук бутылок");
        System.out.println("За месяц машина произвела " + makingBottlesOneMonth + " штук бутылок");
        System.out.println();

        System.out.println("Задача 5");

        int paintSum = 120;
        int needWhitePaintForOneClass = 2;
        int needBrownPaintForOneClass = 4;
        int needAllPaintForOneClass = needWhitePaintForOneClass + needBrownPaintForOneClass;
        int classSum = paintSum/needAllPaintForOneClass;
        int needWhitePaintForAllClass = classSum * needWhitePaintForOneClass;
        int needBrownPaintForAllClass = classSum * needBrownPaintForOneClass;

        System.out.println("В школе, где " + classSum + " классов, нужно " + needWhitePaintForAllClass +
                " банок белой краски и " + needBrownPaintForAllClass + " банок коричневой краски");
        System.out.println();

        System.out.println("Задача 6");

        int quantBanan = 5;
        int weightOneBanan = 80;
        int weightBananSum = quantBanan * weightOneBanan;

        int volumeMilk = 200;
        int weightOneHundredMilk = 105;
        int weightMilkSum = volumeMilk / 100 * weightOneHundredMilk;

        int quantIceCream = 2;
        int weightOneIceCream = 100;
        int weightIceCreamSum = quantIceCream * weightOneIceCream;

        int quantEgg = 4;
        int weightOneEgg = 70;
        int weightEggSum = quantEgg * weightOneEgg;

        float weightBreakfastGr = weightBananSum + weightMilkSum + weightIceCreamSum + weightEggSum;
        float weightBreakfastKg = (weightBreakfastGr/1000);
        System.out.println("Вес данного рецепта завтрака для спортсменов состовляет "
                + weightBreakfastGr + " грамм или " + weightBreakfastKg + " килограмм");
        System.out.println();

        System.out.println("Задача 7");

        int needLoseWeightKg = 7;
        float needLoseWeightGr = needLoseWeightKg * 1000;
        float minLoseWeight = 250f;
        float maxLoseWeight = 500f;
        float middleLoseWeight = (minLoseWeight + maxLoseWeight) / 2;

        float rapidWeightLossDaySum = needLoseWeightGr / maxLoseWeight;
        float slowWeightLossDaySum = needLoseWeightGr / minLoseWeight;
        float middleWeightLossDaySum = needLoseWeightGr / middleLoseWeight;

        System.out.println("Если спортсмен будет худеть по " + maxLoseWeight +
                " грамм в день, то цели он достигнет за " + rapidWeightLossDaySum + " дней");
        System.out.println("Если спортсмен будет худеть по " + minLoseWeight +
                " грамм в день, то цели он достигнет за " + slowWeightLossDaySum + " дней");
        System.out.println("Потребуется " + middleWeightLossDaySum + " дней в среднем для достижения результата похудения");
        System.out.println();

        System.out.println("Задача 8");

        double salaryMonthMasha = 67760;
        double salaryMonthDenis = 83690;
        double salaryMonthKristina = 76230;

        double salaryYearMasha = salaryMonthMasha * 12;
        double salaryYearDenis = salaryMonthDenis * 12;
        double salaryYearKristina = salaryMonthKristina * 12;

        double wageIncreaseSalaryMonthMasha = salaryMonthMasha + (salaryMonthMasha * 0.10);
        double wageIncreaseSalaryMonthDenis = salaryMonthDenis + (salaryMonthDenis * 0.10);
        double wageIncreaseSalaryMonthKristina = salaryMonthKristina + (salaryMonthKristina * 0.10);

        double wageIncreaseSalaryYearMasha = wageIncreaseSalaryMonthMasha * 12;
        double wageIncreaseSalaryYearDenis = wageIncreaseSalaryMonthDenis * 12;
        double wageIncreaseSalaryYearKristina = wageIncreaseSalaryMonthKristina * 12;

        double diffYearSalaryAfterIncreaseMasha = wageIncreaseSalaryYearMasha - salaryYearMasha;
        double diffYearSalaryAfterIncreaseDenis = wageIncreaseSalaryYearDenis - salaryYearDenis;
        double diffYearSalaryAfterIncreaseKristina = wageIncreaseSalaryYearKristina - salaryYearKristina;

        System.out.println("Маша теперь получает " + wageIncreaseSalaryMonthMasha + " " +
                "рублей. Годовой доход вырос на " + diffYearSalaryAfterIncreaseMasha + " рублей");
        System.out.println("Денис теперь получает " + wageIncreaseSalaryMonthDenis + " " +
                "рублей. Годовой доход вырос на " + diffYearSalaryAfterIncreaseDenis + " рублей");
        System.out.println("Кристина теперь получает " + wageIncreaseSalaryMonthKristina + " " +
                "рублей. Годовой доход вырос на " + diffYearSalaryAfterIncreaseKristina + " рублей");


        System.out.println();


    }
}