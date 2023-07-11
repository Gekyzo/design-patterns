package dev.strategy.events;

import java.util.List;
import java.util.Random;

public class UserEventFactory {

  private UserEventFactory() {
    //
  }

  private static final List<UserEvent> OPTIONS = List.of(
      new UserCreatedEvent(),
      new UserDeletedEvent()
  );

  private static final Random RANDOM = new Random();
  private static final int RANDOM_VAL = RANDOM.nextInt(OPTIONS.size());

  public static UserEvent random() {

    return OPTIONS.get(RANDOM_VAL);
  }

}
