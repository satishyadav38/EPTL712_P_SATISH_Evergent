package com.evergent.corejava.practise_SATISH;
//Interface defining rentable behavior
interface Rent {
   public  void rent(String customerName);
    public void returnGame();
}

// Abstract class for a generic game
abstract class Game {
    public String title;
    public String type;
   public int  pricePerDay;
   public  boolean isRented;

    // Constructor
    public Game(String title, String type, int pricePerDay) {
        this.title = title;
        this.type = type;
        this.pricePerDay = pricePerDay;
        this.isRented = false; // By default, the game is not rented
    }

    // Abstract method
    public abstract void displayDetails();

    // Getter for title
    public String titleOfGame() {
       return title;
    }
}

// Concrete class for board games
class GameName extends Game implements Rent {
    public String gameType;

    // Constructor using 'this' keyword
    public GameName(String title, String gameType, int pricePerDay) {
        super(title, "Vedio Game", pricePerDay);
        this.gameType = gameType; // Using 'this' to refer to the instance variable
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + title);
        //System.out.println("Type: " + type);
        System.out.println("Game Type: " + gameType);
        System.out.println("Price per Day: $" + pricePerDay);
        System.out.println("Rented: " + (isRented ? "Yes" : "No"));
    }

    @Override
    public void rent(String customerName) {
        if (!isRented) {
            isRented = true;
            System.out.println(customerName + " rented " + title);
        } else {
            System.out.println(title + " is already rented.");
        }
    }

    @Override
    public void returnGame() {
        if (isRented) {
            isRented = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not rented.");
        }
    }
}

// Class to manage rentals
class RentalDetails {
    private static int ID = 1; // Static variable to keep track of rental IDs
    String gameName;
    private String customerName;

    // Constructor
    public RentalDetails(String gameName,String customerName) {
        this.ID = ID++; // Unique rental ID generated automatically
        this.customerName = customerName;
        this.gameName=gameName;
    }

    public void startRental() {
        System.out.println(customerName);
        System.out.println(gameName);
        System.out.println("Rental ID: " + ID);
    }

    public void endRental() {
        //game.returnGame();
        System.out.println("Rental ID: " + ID + " has been completed.");
    }
}

// Main system class
class EvergentRentalSystem {
    public static void main(String[] args) {
        // Create some games
        GameName chess = new GameName("Chess", "indoor", 50);
        GameName cricket = new GameName("Cricket", "Outdoor", 70);

        // Display details of games
        chess.displayDetails();
        System.out.println();
        chess.rent("John Doe");
        chess.returnGame();
        cricket.displayDetails();
        System.out.println();
         cricket.rent("satish");
         cricket.returnGame();
        // Renting chess game
        RentalDetails r1 = new RentalDetails("chess", "John Doe");
        r1.startRental();
        
        System.out.println();

        // Trying to rent the already rented chess game
       /* RentalDetails r2 = new RentalDetails(chess, "Jane Doe");
        r2.startRental(); // This should show that the game is already rented
        System.out.println();*/

        // Returning the chess game
        r1.endRental();
        System.out.println();

        // Now Jane can rent the game
       /* r1.startRental();
        r2.endRental();*/
    }
}

