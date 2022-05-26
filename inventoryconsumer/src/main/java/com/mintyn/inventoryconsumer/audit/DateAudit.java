package com.mintyn.inventoryconsumer.audit;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@JsonIgnoreProperties(
        value = { "createdAt", "updatedAt" },
        allowGetters = true
)
public abstract class DateAudit implements Serializable {

    private static final long serialVersionUID = 1L;

    private Date createdAt;

    private Date updatedAt;

}