package com.samkt17.rockpaperscissor;

public abstract class Player {

  Weapon choice;
  int score;

  void makeChoice(Weapon choice) {
    this.choice = choice;
  }

  void increaseScore() {
    score++;
  }

  int getScore() {
    return score;
  }

  Weapon getChoice() {
    return choice;
  }

  Weapon makeChoice(Weapon[] weapons) {
    return choice;
  }
}
