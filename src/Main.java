public class Main {
    public static void main(String[] args) {
        int account = 100;
        int deposit = 1100;
        int oldBonus = 20;
        boolean refill = deposit >= 1000;

        int newBonus = refill ? deposit / 100 : 0;

        System.out.println("Итоговый счет: " + (account + deposit) + " рублей(ля)");
        System.out.println("Количество бонусных рублей: " + (oldBonus + newBonus) + " рублей(ля)");

    }
}

/*  второй вариант:*/

/*
public class Main {
    public static void main(String[] args) {
        int account = 200;
        int deposit = 1100;
        int oldBonus = 50;

        System.out.println("Итоговый счет: " + (account + deposit) + " рублей(ля)");

        if (deposit >= 1000) {
            System.out.println("Количество бонусных рублей: " + (oldBonus + deposit / 100) + " рублей(ля)");
        } else {
            System.out.println("Количество бонусных рублей: " + oldBonus + " рублей");
        }
    }
}
 */
