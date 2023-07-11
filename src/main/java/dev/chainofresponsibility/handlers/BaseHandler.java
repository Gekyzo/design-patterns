package dev.chainofresponsibility.handlers;

import dev.chainofresponsibility.UserLoginInformation;

public abstract class BaseHandler implements Handler {

  protected static final String NEW_LINE = System.getProperty("line.separator");

  protected Handler nextHandler;

  @Override
  public Handler next(final Handler nextHandler) {

    this.nextHandler = nextHandler;
    return nextHandler;
  }

  @Override
  public void processNext(final UserLoginInformation userLoginInformation) {

    if (this.nextHandler != null) {
      this.nextHandler.process(userLoginInformation);
    }
  }

}
