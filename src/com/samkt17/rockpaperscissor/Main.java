package com.samkt17.rockpaperscissor;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Weapon rock = new Rock();
    Weapon paper = new Paper();
    Weapon scissors = new Scissors();
    Weapon gun = new Gun();

    Weapon[] weapons = {rock, paper, scissors, gun};

    Player user = new User();
    Player computer = new Computer();

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Choice: Rock - 1, Paper - 2, Scissors - 3, Gun - 4");
    int choice = sc.nextInt();
    user.makeChoice(weapons[choice-1]);
    computer.makeChoice(weapons);

    String computerChoice = computer.getChoice().getName();
    String userChoice = user.getChoice().getName();

    user.getChoice().display();
    System.out.println("VS.");
    computer.getChoice().display();

    if (userChoice.equals(computerChoice)) {
      System.out.println("There is a tie!");
    }
    else if (user.getChoice().beats(computerChoice)) {
      System.out.println(userChoice + user.getChoice().performAction() + computerChoice);
      System.out.println("User wins!");
    } else {
      System.out.println(computerChoice + computer.getChoice().performAction() + userChoice);
      System.out.println("Computer wins!");
    }
  }
}
