package dev.chainofresponsibility.handlers;

import dev.chainofresponsibility.UserLoginInformation;

public interface Handler {

  Handler next(final Handler nextHandler);

  void process(final UserLoginInformation userLoginInformation);

  void processNext(final UserLoginInformation userLoginInformation);

}
