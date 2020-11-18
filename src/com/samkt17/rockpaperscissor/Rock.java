package com.samkt17.rockpaperscissor;

public class Rock extends Weapon {

  public Rock() {
    actionBehavior = new Smash();
    beats = new String[]{"Scissors"};
    name = "Rock";
  }

  public void display() {
    System.out.println("    _______");
    System.out.println("---'   ____)");
    System.out.println("      (_____)");
    System.out.println("      (_____)");
    System.out.println("      (____)");
    System.out.println("---.__(___)");
  }
}
