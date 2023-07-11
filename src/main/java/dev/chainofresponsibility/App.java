package dev.chainofresponsibility;

import dev.chainofresponsibility.handlers.UserExistsHandler;
import dev.chainofresponsibility.handlers.RoleCheckHandler;
import dev.chainofresponsibility.handlers.Handler;
import dev.chainofresponsibility.handlers.ValidPasswordHandler;

public class App {

  public static void main(String[] args) {

    final UserLoginInformation userLoginInformation = new UserLoginInformation();

    final Handler firstStep = new UserExistsHandler();
    final Handler secondStep = new ValidPasswordHandler();
    final Handler thirdStep = new RoleCheckHandler();

    // Create Chain
    firstStep
        .next(secondStep)
        .next(thirdStep);

    // Process Chain
    firstStep.process(userLoginInformation);
  }

}