package com.mintyn.inventoryconsumer.consumer;

import com.mintyn.inventoryconsumer.models.Order;
import com.mintyn.inventoryconsumer.models.OrderItem;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumerService {

    @KafkaListener(topics="orderProducts", groupId="order_json", containerFactory = "orderKafkaListenerFactory")
    public void consumeFromObject(Order message) {
        System.out.println("Consumed message "+message);

        int totalItems = message.getItems().size();

    }
}
