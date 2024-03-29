import java.util.Scanner;
public class RESERVATION_SYSYTEM {
    private static boolean[] seats = new boolean[50]; // initialize an array of 50 seats, all empty
/* Aother Bhanu Pratap Yadav
* */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Showing menu
            System.out.println("\nPlease select an option:");
            System.out.println("1. View Seat Map");
            System.out.println("2. Reserve Seat");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Exit");
            //  Input by user side
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    viewSeatMap();
                    break;
                case 2:
                    reserveSeat();
                    break;
                case 3:
                    cancelReservation();
                    break;
                case 4:
                    System.exit(0); // exit the program
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
    private static void viewSeatMap() {
        System.out.println("\nCurrent Seat Map:");
        for (int i = 0; i < seats.length; i++) {
            if (seats[i]) {
                System.out.print("Z "); // print an "Z" if the seat is reserved
            } else {
                System.out.print((i + 1) + " "); // print the seat number if it's empty
            }
        }
        System.out.println();
    }
    private static void reserveSeat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter seat number (1-50): ");
        int seatNumber = scanner.nextInt();
        if (seatNumber < 1 || seatNumber > 50) {
            System.out.println("Invalid seat number!");
        } else if (seats[seatNumber - 1]) {
            System.out.println("Seat already reserved!");
        } else {
            seats[seatNumber - 1] = true; // reserve the seat
            System.out.println("Seat reserved!");
        }
    }
    private static void cancelReservation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter seat number (1-50): ");
        int seatNumber = scanner.nextInt();
        if (seatNumber < 1 || seatNumber > 50) {
            System.out.println("Invalid seat number!");
        } else if (!seats[seatNumber - 1]) {
            System.out.println("Seat not reserved!");
        } else {
            seats[seatNumber - 1] = false; // unreserve the seat
            System.out.println("Reservation canceled!");
        }
    }
}