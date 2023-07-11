package dev.strategy.processors;

public class CardPaymentProcessor implements PaymentProcessor {

  @Override
  public String getPaymentProcessor() {

    return "Card Payment Processor";
  }

}
