package dev.strategy.processors;

public class PaypalPaymentProcessor implements PaymentProcessor {

  @Override
  public String getPaymentProcessor() {

    return "Paypal Payment Processor";
  }

}
