package com.mintyn.inventoryconsumer.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mintyn.inventoryconsumer.audit.DateAudit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem extends DateAudit {

    private static final long serialVersionUID = 591505171819818841L;

    private String id;

    @JsonIgnore
    private Order order;

    private Products product;

    private Integer quantity;

    private Double unitPrice;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderItem orderItem = (OrderItem) o;
        return order.equals(orderItem.order) &&
                product.equals(orderItem.product) &&
                quantity.equals(orderItem.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, product, quantity);
    }
}
