public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 1 ***************************************");
        System.out.println(" ");
        System.out.println("Задание 1 - Определить срок накопления 2 459 т. руб.");
        {
            int salary = 29_000;
            int total = 0;
            int i = 0;
            while (total < 2_459_000) {
                total = total + salary;
                i++;
            }
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей.");
        }
        System.out.println(" ");
        System.out.println("Задание 2 - Вывод чисел в 2 строки 1-10 и 10-1.");
        {
            int i = 1;
            while (i <= 10) {
                System.out.print(i + " ");
                i++;
            }
            System.out.println(" ");
            for (int j = 10; j >= 1; j--) {
                System.out.print(j + " ");
            }
        }
        System.out.println(" ");
        System.out.println("Задание 3 - Расчет численности населения через 10 лет.");
        {
            int population = 12_000_000;  // Население страны
            int brithRate = 17;          //  Рождаемость детей/1000 чел.
            int mortality = 8;           //  Смертность чел./1000 чел.
            for (int i = 1; i <= 10; i++) {
                population = population + (population * brithRate / 1000) - (population * mortality / 1000);
                System.out.println("Год " + i + " , численность населения составляет " + population);
            }
        }
        System.out.println(" ");
        System.out.println("Домашнее задание 2 ***************************************");
        // Василий положил 15 000 рублей в банк под 7 % в месяц.
        System.out.println(" ");
        System.out.println("Задание 1 - За сколько можно накопить 12 млн ");
        {
            double total = 15_000;
            double rate = 0.07;
            for (int i = 1; total <= 12_000_00; i++) {
                total = total + (total * rate);
                System.out.println("Месяц " + i + " , сумма накоплений " + Math.round(total) + " руб.");
            }
        }
        System.out.println(" ");
        System.out.println("Задание 2 - Дополнение 1 к Задаче 1 - выводить только каждфй 6 месяц ");
        {
            double total = 15_000;
            double rate = 0.07;   // % по вкладу в месяц
            for (int i = 1; total <= 12_000_00; i++) {
                total = total + (total * rate);
                if (i % 6 == 0) {
                    System.out.println("Месяц " + i + " , сумма накоплений " + Math.round(total) + " руб.");
                }
            }
        }
        System.out.println(" ");
        System.out.println("Задание 3 - Дополнение 2 к Задаче 1 - выводить каждфй 6 месяц в течении 9 лет. ");
        {
            double total = 15_000;
            double rate = 0.07; // % по вкладу в месяц
            int month_9year = 12 * 9;
            for (int i = 1; i <= month_9year; i++) {
                total = total + (total * rate);
                if (i % 6 == 0) {
                    System.out.println("Месяц " + i + " , сумма накоплений " + Math.round(total) + " руб.");
                }
            }
        }
        System.out.println(" ");
        System.out.println("Задание 4 - Пятница - день отчета");
        int fridy = 2; // число 1-й пятници месяца
        while (fridy <= 31) {
            System.out.println("Сегодня пятница, " + fridy + "-е число. Необходимо подготовить отчёт!");
            fridy = fridy + 7;
        }
        System.out.println(" ");
        System.out.println("Домашнее задание 3 ***************************************");
        System.out.println(" ");
        System.out.println("Задание 1 - Года пролёта кометы. ");
        {
        int period = 79;
        int p = 0; // переменная, сохраняющая текущее значение пересчета годов прилёта кометы
        int yearNow = 2022;
        while (p <= yearNow) {
           p = p + period;
           if (p >= (yearNow - 200) && p <= (yearNow + 100))
               System.out.println(p);
            }
        }
        System.out.println(" ");
        System.out.println("Задание 2 - Таблица умножения на 2. ");
        int multiple = 2;  // дежурный множетель ТУ
        int result;
        for (int i = 1; i <= 10; i++) {
            result = i * multiple;
            System.out.println(i + " * " + multiple + " = " + result);
        }

    }
}