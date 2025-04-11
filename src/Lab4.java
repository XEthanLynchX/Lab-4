import java.util.Scanner;

class ParkWallet{
    private int tickets;
    private static boolean holiday = false;

    public ParkWallet(){
        tickets = 0;
    }

    public ParkWallet(int intialTickets){
        tickets = intialTickets;
    }

    public int getTickets(){
        return tickets;
    }

    public static boolean getHoldiday(){
        return holiday;
    }

    public void setTickets(int tickets){
        if (tickets >= 0 ){
            this.tickets = tickets;
        }
    }

    public static void setHoliday() {
        holiday = !holiday;
    }

    public void addTicket(int amount){
        if(tickets >= 0){
            this.tickets += amount;
        }
    }

    public boolean removeTickets(int amount){
        if (amount >= 0 && tickets >= amount){
            tickets -= amount;
            return true;
        }
        else{
            return false;
        }
    }


}
public class Lab4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ParkWallet wallet = new ParkWallet(100);
        boolean running = true;
        boolean firstrun = true;
        while (running){
            if (firstrun){
                System.out.println("Theme Park Wallet Manager");
                firstrun = false;
            }
            System.out.println("1. Add tickets");
            System.out.println("2. Set tickets");
            System.out.println("3. Buy prize");
            System.out.println("4. Set holiday");
            System.out.println("5. Quit");
            System.out.println("Your wallet has " + wallet.getTickets() + "tickets");
            System.out.println("Enter option: ");
            int input = scan.nextInt();
            System.out.println();

            switch(input){
                case 1:
                    System.out.println("Add How Many tickets");
                    int ticketsadded = scan.nextInt();
                    wallet.addTicket(ticketsadded);

                case 2:
                    System.out.println("Set ticket balance to: ");
                    int ticketsadded
            }


        }
        }
    }
