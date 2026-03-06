package com.example.os.api.service;

import com.example.os.api.common.Payment;
import com.example.os.api.common.TransactionRequest;
import com.example.os.api.common.TransactionResponse;
import com.example.os.api.entity.Order;
import com.example.os.api.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private RestTemplate restTemplate;

    public TransactionResponse saveOrder(TransactionRequest transactionRequest)
    {
        String response="";
        Order order = transactionRequest.getOrder();
        Payment payment=transactionRequest.getPayment();
        payment.setOrderId(order.getId());
        payment.setAmount(order.getPrice());
        //rest Call
        Payment paymentResponse = restTemplate.postForObject("http://PAYMENT-SERVICE/doPayment",payment,Payment.class);

        response=paymentResponse.getPaymentStatus().equals("success")?"payment processing successfull":"payment failed in payment api";

        orderRepository.save(order);
        return new TransactionResponse(order,paymentResponse.getAmount(),paymentResponse.getTransactionId(),response);
    }

}
