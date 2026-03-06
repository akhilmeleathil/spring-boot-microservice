package com.example.os.api.controller;

import com.example.os.api.common.Payment;
import com.example.os.api.common.TransactionRequest;
import com.example.os.api.common.TransactionResponse;
import com.example.os.api.entity.Order;
import com.example.os.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/BookOrder")
    public TransactionResponse BookOrder(@RequestBody TransactionRequest transactionRequest)
    {
        return orderService.saveOrder(transactionRequest);
        //return orderService.saveOrder(order);
    }
}
