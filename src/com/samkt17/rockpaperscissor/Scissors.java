package com.samkt17.rockpaperscissor;

public class Scissors extends Weapon{

  public Scissors() {
    actionBehavior = new Cut();
    beats = new String[]{"Paper"};
    name = "Scissors";
  }

  public void display() {
    System.out.println("    _______");
    System.out.println("---'   ____)____");
    System.out.println("          ______)");
    System.out.println("       __________)");
    System.out.println("      (____)");
    System.out.println("---.__(___)");
  }
}
