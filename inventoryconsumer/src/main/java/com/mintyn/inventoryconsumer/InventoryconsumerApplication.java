package com.mintyn.inventoryconsumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mintyn.inventoryconsumer.models.OrderItem;
import org.apache.kafka.clients.CommonClientConfigs;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.Map;

@SpringBootApplication
public class InventoryconsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryconsumerApplication.class, args);
    }

}
