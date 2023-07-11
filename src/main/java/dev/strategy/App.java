package dev.strategy;

import dev.strategy.events.UserEvent;
import dev.strategy.events.UserEventFactory;

public class App {

  public static void main(String[] args) {

    final UserEvent userEvent = UserEventFactory.random();
    userEvent.getProcessor().process();

  }

}