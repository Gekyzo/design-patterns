package dev.chainofresponsibility.handlers;

import dev.chainofresponsibility.UserLoginInformation;

public class UserExistsHandler extends BaseHandler {

  @Override
  public void process(final UserLoginInformation userLoginInformation) {

    System.out.println(NEW_LINE + "UserExistsHandler processing...");

    processNext(userLoginInformation);
  }

}
