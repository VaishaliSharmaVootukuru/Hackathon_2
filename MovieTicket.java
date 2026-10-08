import java.util.Scanner;

public class MovieTicket {
    
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    
    public MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    
    public double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    
    public double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return 0.10 * calculateTotal();
        }
        return 0.0;
    }

    
    public double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    
    public void displayBill() {
        System.out.println("Movie Name: " + movieName);
        System.out.printf("Ticket Price: %.2f\n", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
       
        System.out.printf("Total Amount: %.2f\n", calculateTotal());
        System.out.printf("Discount: %.2f\n", calculateDiscount());
        System.out.printf("Final Amount: %.2f\n", calculateFinalAmount());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter the movei name");
        String movieName = scanner.nextLine();
        System.out.println("pls enter the ticket price");
        double ticketPrice = scanner.nextDouble();
        System.out.println("please enter the number of tickets");
        int numberOfTickets = scanner.nextInt();

        
        MovieTicket ticket = new MovieTicket(movieName, ticketPrice, numberOfTickets);

        
        ticket.calculateTotal();
        ticket.calculateDiscount();
        ticket.calculateFinalAmount();

        
        ticket.displayBill();

        scanner.close();
    }
}
