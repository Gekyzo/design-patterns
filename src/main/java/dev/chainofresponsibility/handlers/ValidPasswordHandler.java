package dev.chainofresponsibility.handlers;

import dev.chainofresponsibility.UserLoginInformation;

public class ValidPasswordHandler extends BaseHandler {

  @Override
  public void process(final UserLoginInformation userLoginInformation) {

    System.out.println(NEW_LINE + "ValidPasswordHandler processing...");

    processNext(userLoginInformation);
  }

}
