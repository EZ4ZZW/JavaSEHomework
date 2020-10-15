public class TicketMachine {

    int price;
    int balance;
    int Turnover;

    public TicketMachine(int price) {
        balance = 0;
        Turnover = 0;
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be positive");
        }
    }

    public void insertMoney(int money) {
        if (money < 0) {
            System.out.println("The Money You Added Must Be Positive!");
        } else {
            balance += money;
        }
    }

    public void printTicket() {
        if (balance < price) {
            System.out.println("Balance is not enough!");
        } else {
            System.out.println("=================");
            System.out.println("This is a ticket");
            System.out.println("price: " + price + " ￥");
            System.out.println("=================");
            balance -= price;
            Turnover += price;
        }

    }

    public void refundBalance() {
        int moneyRefunded = balance;
        balance = 0;
        System.out.println("This is your money!");
        System.out.println("Total " + moneyRefunded + " ￥");
        System.out.println("Don't forget it.");
        return;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBalance() {
        return balance;
    }

    public int getTurnover() {
        return Turnover;
    }

}
