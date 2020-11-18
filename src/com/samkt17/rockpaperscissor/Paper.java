package com.samkt17.rockpaperscissor;

public class Paper extends Weapon {

  public Paper() {
    actionBehavior = new Cover();
    beats = new String[]{"Rock"};
    name = "Paper";
  }

  public void display() {
    System.out.println("     _______");
    System.out.println("---'    ____)____");
    System.out.println("           ______)");
    System.out.println("          _______)");
    System.out.println("         _______)");
    System.out.println("---.__________)");
  }
}
