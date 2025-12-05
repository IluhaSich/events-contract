package com.example.events_contract.events;

import java.io.Serializable;

public record DelicacyDeletedEvent(
        Long delicacyId
) implements Serializable {
}
