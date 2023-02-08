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
