package dev.strategy.processors;

public class UserCreatedEventProcessor implements EventProcessor {

  @Override
  public void process() {

    System.out.println("User has been created");
  }

}
