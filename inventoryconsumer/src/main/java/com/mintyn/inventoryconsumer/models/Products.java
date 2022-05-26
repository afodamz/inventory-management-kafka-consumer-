package com.mintyn.inventoryconsumer.models;

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
public class Products extends DateAudit {

    private static final long serialVersionUID = 5504624538233192642L;

    private String id;

    private String name;

    private String description;

    private Double totalInStock;

    private Double price;

    private Boolean isDeleted = Boolean.FALSE;

//    @JsonIgnore
//    @Version
//    private long version;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Products product = (Products) o;
        return id.equals(product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
