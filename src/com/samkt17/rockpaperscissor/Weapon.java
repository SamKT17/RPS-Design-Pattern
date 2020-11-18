package com.samkt17.rockpaperscissor;

public abstract class Weapon {

  ActionBehavior actionBehavior;
  String[] beats;
  String name;

  String performAction() {
    return actionBehavior.action();
  }

  void display() {
    System.out.println("Insert ASCII drawing here.");
  }

  boolean beats(String choice) {

    boolean doesBeat = false;

    for (String beat : beats) {
      if (choice.equals(beat)) {
        doesBeat = true;
      }
    }
    return doesBeat;
  }

  String getName() {
    return name;
  }
}
