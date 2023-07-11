package dev.strategy.processors;

public interface PaymentProcessor {

  default String getPaymentProcessor() {

    return "Payment Processor Interface";
  }

}
