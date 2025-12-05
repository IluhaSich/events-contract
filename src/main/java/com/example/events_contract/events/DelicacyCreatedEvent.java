package com.example.events_contract.events;

import java.io.Serializable;
import java.util.List;

public record DelicacyCreatedEvent(
        Long delicacyId,
        List<ProductDto> products
) implements Serializable {

}

