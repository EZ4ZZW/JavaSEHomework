import java.util.Scanner;

public class TicketCmd {
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
            String operation;
            operation = scanner.nextLine();
            switch (operation) {
                case "1" :
                    System.out.println("Please input the money you want to insert:");
                    int money = scanner.nextInt();
                    ticketMachine.insertMoney(money);
                    break;
                case "2":
                    ticketMachine.printTicket();
                    break;
                case "3":
                    ticketMachine.refundBalance();
                    break;
            }
        }
    }
}
