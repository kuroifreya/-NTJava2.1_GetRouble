public class Main {
    public static void main(String[] args) {
        double balance = -1050;
        double replenishment = 1010;
        int bonus;

        bonus = (replenishment > 1000) ? (int)(replenishment / 100) : 0;
        balance = balance + replenishment + bonus;

        System.out.println("Ваш баланс: " + balance + "р.");
        if (bonus > 0) {
            System.out.println("Вы пополнили баланс больше, чем на тысячу рублей, поэтому мы добавили к сумме " + bonus + " р. :)");
            }
            else {
            System.out.println("Вы можете получить бонус, если пополните баланс больше, чем на тысячу рублей!");
            }
    }
}
