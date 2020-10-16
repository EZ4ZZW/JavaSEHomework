import java.util.Scanner;

public class testTicketMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicketMachine ticketMachine = new TicketMachine(5);
        while (true) {
            System.out.println("============================");
            System.out.println("==Welcome To TicketMachine==");
            System.out.println("====1.Insert Money      ====");
            System.out.println("====2.Buy A Ticket      ====");
            System.out.println("====3.Refund Money      ====");
            System.out.println("============================");
            System.out.println("Please input the oder to continue");
            int operation;
            operation = scanner.nextInt();
            if (operation == 1) {
                System.out.println("Please input the money you want to insert:");
                int money = scanner.nextInt();
                ticketMachine.insertMoney(money);
            } else if (operation == 2) {
                ticketMachine.printTicket();
            } else {
                ticketMachine.refundBalance();
                break;
            }
        }
    }
}
