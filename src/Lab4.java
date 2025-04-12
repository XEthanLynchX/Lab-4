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
            System.out.println("Your wallet has " + wallet.getTickets() + " tickets");
            System.out.print("Enter option: ");
            int input = scan.nextInt();
            System.out.println();

            switch(input){
                case 1:
                    System.out.print("Add How Many tickets");
                    int addTickets = scan.nextInt();
                    wallet.addTicket(addTickets);
                    break;

                case 2:
                    System.out.print("Set ticket balance to: ");
                    int setTickets = scan.nextInt();
                    wallet.setTickets(setTickets);
                    break;

                case 3:
                    System.out.println("T-shirt (150 tickets)");
                    System.out.println("Sun hat (350 tickets)");
                    System.out.println("Sneakers (600 tickets)");
                    System.out.print("Buy which prize? ");

                    int prizeNum = scan.nextInt();
                    int price = 0;
                    int tshirtPrice = 150;
                    int sunhatPrice = 350;
                    int sneakers = 600;


                    String prizeitem = "";
                    switch(prizeNum){
                        case 1:
                            if (wallet.getHoldiday()){
                                price = tshirtPrice /2;
                                prizeitem = "T-shirt";
                            }
                            else {
                                price = tshirtPrice;
                                prizeitem = "T-shirt";
                            }
                            break;
                        case 2:
                            if (wallet.getHoldiday()){
                                price = tshirtPrice /2;
                                prizeitem = "sun hat";
                            }
                            else {
                                price = sunhatPrice;
                                prizeitem = "sun hat";
                            }
                            break;
                        case 3:
                            if(wallet.getHoldiday()){
                                price = sneakers;
                                prizeitem = "sneakers";
                            }
                            else {
                                price = 600;
                                prizeitem = "sneakers";
                            }
                            break;
                    }
                    if (wallet.removeTickets(price)){
                        System.out.println("Bought "+ prizeitem + " for " + price + " tickets");
                }
                    else{
                        System.out.println("Not enough tickets to buy " + prizeitem);
                    }
                    break;
                case 4:
                    wallet.setHoliday();
                    if (wallet.getHoldiday()){
                        System.out.println("It is now a holiday");
                    }
                    else{
                        System.out.println("It is no longer a holiday");
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println("Shutting off...");
                    scan.close();

            }



        }
        }
    }
