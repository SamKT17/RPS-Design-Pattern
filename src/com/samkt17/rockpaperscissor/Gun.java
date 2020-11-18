package com.samkt17.rockpaperscissor;

public class Gun extends Weapon {

  public Gun() {
    actionBehavior = new Shoot();
    beats = new String[]{"Scissors", "Paper"};
    name = "Gun";
  }

  @Override
  void display() {
    System.out.println("    _______");
    System.out.println("---'   ____)____");
    System.out.println("          ______)");
    System.out.println("      (_____)");
    System.out.println("      (____)");
    System.out.println("---.__(___)");
  }
}
