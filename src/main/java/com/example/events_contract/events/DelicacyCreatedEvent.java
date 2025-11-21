package com.example.events_contract.events;

import java.io.Serializable;
import java.util.List;

public class DelicacyCreatedEvent implements Serializable {

    private Long delicacyId;
    private List<ProductDto> products;

    public DelicacyCreatedEvent(Long delicacyId, List<ProductDto> products) {
        this.delicacyId = delicacyId;
        this.products = products;
    }

    public Long getDelicacyId() {
        return delicacyId;
    }

    public List<ProductDto> getProducts() {
        return products;
    }
}

