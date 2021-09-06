package com.example.springcloud.service;

import com.example.springcloud.entities.Payment;

public interface PaymentService {

    public int add(Payment payment);

    public Payment getPaymentById(Long id);
}
