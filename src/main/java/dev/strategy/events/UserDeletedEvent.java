package dev.strategy.events;

import dev.strategy.processors.EventProcessor;
import dev.strategy.processors.UserDeletedEventProcessor;

public class UserDeletedEvent implements UserEvent {

  @Override
  public EventProcessor getProcessor() {

    return new UserDeletedEventProcessor();
  }

}

