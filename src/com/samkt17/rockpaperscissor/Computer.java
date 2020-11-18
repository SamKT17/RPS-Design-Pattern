package com.samkt17.rockpaperscissor;

import java.util.Random;

public class Computer extends Player {

  Computer() {
    score = 0;
  }

  public Weapon makeChoice(Weapon[] weapons) {
    Random random = new Random();
    int choice = random.nextInt(weapons.length);
    this.choice = weapons[choice];
    return weapons[choice];
  }
}
