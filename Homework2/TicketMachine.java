public class TicketMachine {

    int price;
    int balance;
    int total;

    public TicketMachine(int perTicket) {
        balance = 0;
        total = 0;
        if (perTicket > 0) {
            price = perTicket;
        } else {
            System.out.println("Price must be positive");
        }
    }

    public void insertMoney(int amount) {
        if (amount < 0) {
            System.out.println("The Money You Add Must Be Positive!");
        } else {
            balance += amount;
        }
    }

    public void printTicket() {
        if (balance < price) {
            System.out.println("balance is not enough!");
        } else {
            System.out.println("=========================");
            System.out.println("This is a ticket");
            System.out.println("price:" + price + "Yuan");
            System.out.println("=========================");
            balance = balance - price;
            total += price;
        }

    }

    public void refundBalance() {
        int amountRefunded = balance;
        balance = 0;
        System.out.println("This is your money!"+amountRefunded+"Yuan");
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

    public int getTotal() {
        return total;
    }

}
