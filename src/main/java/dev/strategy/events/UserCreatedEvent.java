package dev.strategy.events;

import dev.strategy.processors.EventProcessor;
import dev.strategy.processors.UserCreatedEventProcessor;

public class UserCreatedEvent implements UserEvent {

  @Override
  public EventProcessor getProcessor() {

    return new UserCreatedEventProcessor();
  }

}
