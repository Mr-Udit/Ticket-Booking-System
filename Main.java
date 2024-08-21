import java.util.*;

public class Main {
    static int ticketNumber;
    static int ticketPrice;
    static int seats[];
    static int seatN0[];
    static String names[];
    static int seatNumber;
    static String name;
    Main() {
        ticketNumber = 0;
        ticketPrice = 50;
        seats = new int[100];
        seatN0 = new int[100];
        names = new String[100];
        seatNumber = 0;
        for (int i = 0; i < seats.length; i++) {
            seats[i] = 0;
        }
        for (int i = 0; i < seatN0.length; i++) {
            seatN0[i] = 0;
        }
    }

    static void bookSeat(int seat) {
        Scanner sc = new Scanner(System.in);
        if (seat < 100) {
            if (seats[seat] == 0 && seats[seat] == 0) {
                seats[seat] = 1;
                seatN0[ticketNumber] = seat;
                seatNumber = seat;
                names[ticketNumber] = name;
                ticketNumber++;
                System.out.println("Seat booked successfully");
                System.out.println("Do you wnat to book another ticket. Or Print this");
                System.out.println("1. Book another ticket");
                System.out.println("2. Print tickets");
                System.out.println("0. to go to main menu");
                int choice = sc.nextInt();
                if (choice == 1) {
                    accept();
                }
                else if (choice == 2) {
                    print(ticketNumber);
                }
                else if (choice ==0) {
                    redirect();
                }
            } else {
                System.out.println("Seat already booked");
            }
        } else {
            System.out.println("No Such Seat avilable");
        }
    }
    static void print(int x){
        for (int i = 0; i < 30; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.println("the name of the consumer is : " + names[x-1]);
        System.out.println("the Ticket number of the consumer is : " + x);
        System.out.println("the price of ticket is : " + ticketPrice);
        System.out.println("the seat number of the consumer is : " + seatN0[x-1]);
        for (int i = 0; i < 30; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    static void check(int x) {
        System.out.println("the value of seats[x] : "+seats[x]);
            if (seats[x] == 0) {
                System.out.println("Seat number " + x + " is available");
            }
            else{
                System.out.println("Seat number " + x + " is not available");
            }
    }

    static void summary() {
        System.out.println("The total number of tickets booked is : " + ticketNumber);
        System.out.println("The total price of tickets is : " + ticketPrice * ticketNumber);
        System.exit(0);
    }

    static void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of the costumer : ");
        name = sc.nextLine();
        System.out.println("Enter the seat number : ");
        seatNumber = sc.nextInt();
        bookSeat(seatNumber);
    }

    static void display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the ticket number you want to print :");
        int x = sc.nextInt();
        print(x);
    }
    static void printAllTickets(){
        for (int i = 1; i <= ticketNumber; i++) {
            print(i);
        }
    }
    static void redirect() {
        Scanner sc = new Scanner(System.in);
        System.out.println("press");
        while (true) {
            System.out.println("\n 1.accept \n 2.display \n 3.check \n 5. to print all tickets \n 4.summary \n 0.exit");
        int choise = sc.nextInt();
        if (choise == 1) {
            accept();
        } else if (choise == 2) {
            display();
        } else if (choise == 3) {
            System.out.println("enter the seat number you want to check : ");
            int x = sc.nextInt();
            check(x);
        }else if (choise == 5) {
            printAllTickets();
        }
         else if (choise == 0) {
            summary();
        }
        else{
            continue;
        }
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        redirect();
    }
}
