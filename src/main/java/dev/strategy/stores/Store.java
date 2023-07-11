package dev.strategy.stores;

import dev.strategy.processors.PaymentProcessor;

public class Store {

  public void pay(final PaymentProcessor paymentProcessor) {

    System.out.println(paymentProcessor.getPaymentProcessor());
  }

}
