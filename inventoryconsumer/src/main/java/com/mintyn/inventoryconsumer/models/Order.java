package com.mintyn.inventoryconsumer.models;

import com.mintyn.inventoryconsumer.audit.DateAudit;
import lombok.*;

import java.util.Objects;
import java.util.Set;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order extends DateAudit {

    private static final long serialVersionUID = -8832862623919132232L;

    private String id;

    private String name;

    private String phoneNumber;

    private Boolean isDeleted = Boolean.FALSE;

    private Set<OrderItem> items;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return id.equals(order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Double getTotalPrice() {
        return items.stream().mapToDouble(item -> item.getUnitPrice() * item.getQuantity()).sum();
    }
}
