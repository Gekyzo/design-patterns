package dev.chainofresponsibility.handlers;

import dev.chainofresponsibility.UserLoginInformation;

public class RoleCheckHandler extends BaseHandler {

  @Override
  public void process(final UserLoginInformation userLoginInformation) {

    System.out.println(NEW_LINE + "RoleCheckHandler processing...");

    processNext(userLoginInformation);
  }

}
