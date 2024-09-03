public class Main {
    public static void main(String[] args) {
        int TicketCost = 20000;
        int bonusScale = 20;
        int bonusMile = TicketCost / bonusScale;

        System.out.println("При покупке билета стоимостью " + TicketCost + " руб., Ваш бонус составит " + bonusMile + "бонусных миль,");

    }
}