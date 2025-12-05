package com.example.events_contract.events;

import java.io.Serializable;

public record ProductDto(
        Long id,
        String name,
        Double price
) implements Serializable {
}
