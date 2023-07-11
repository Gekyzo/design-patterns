package dev;

import dev.strategy.processors.CardPaymentProcessor;
import dev.strategy.processors.PaypalPaymentProcessor;
import dev.strategy.stores.Store;

public class Main {

  public static void main(String[] args) {

    final PaypalPaymentProcessor paypalProcessor = new PaypalPaymentProcessor();
    final CardPaymentProcessor cardPaymentProcessor = new CardPaymentProcessor();

    final Store store = new Store();
    store.pay(paypalProcessor);

  }

}