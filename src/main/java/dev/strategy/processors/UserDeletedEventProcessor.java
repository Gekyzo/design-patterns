package dev.strategy.processors;

public class UserDeletedEventProcessor implements EventProcessor {

  @Override
  public void process() {

    System.out.println("User has been deleted");
  }

}
