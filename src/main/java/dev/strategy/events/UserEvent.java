package dev.strategy.events;

import dev.strategy.processors.EventProcessor;

public interface UserEvent {

  EventProcessor getProcessor();

}
