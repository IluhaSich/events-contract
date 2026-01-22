package com.example.events_contract.events;

import java.io.Serializable;

public record DelicacyAnalyzedEvent(
        Long delicacyId,
        Integer score,
        String verdict
) implements Serializable {
}