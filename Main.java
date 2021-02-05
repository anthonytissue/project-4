import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Weclome to the GameStore!");
    System.out.println("Consoles: Xbox = $300, Playstation = $250, Wii = $25");
    System.out.println("Games: Rainbow = $60, Fornite = $50, Rocket League = $30");

    System.out.println("Welcome to the GameStore! What console would you like to buy? 300.0 Xbox 250.0 Playstation 60.0 Wii");

    int consolePick = scan.nextInt();

    System.out.println("How much money did you bring to the store?");
    double allMoney = scan.nextDouble();

    System.out
        .println("What game would you like to buy with your console? 50.0 Call of Duty, 60.0 Rainbow, 20.0 Rocket League");

    int gameNumber = scan.nextInt();

    double leftOver = enough(consolePick, allMoney);
    System.out.println("This is how much money you have now: " + leftOver);

    if (allMoney >= 300) {
      System.out.println("You have enough for everything. Would you like to buy a game with it ?");
      scan.nextBoolean();
    }

  }

  static double enough(int consolePick, double allMoney) {
    if (allMoney > consolePick) {
      System.out.println("You have enough for a game");
      return allMoney - consolePick;
    } else {
      System.out.println("You dont have enough");
      return allMoney;
    }

  }

  static double gameNumber(double leftOver) {
    int gameNumber = 60;

    return leftOver - gameNumber;
  }
}