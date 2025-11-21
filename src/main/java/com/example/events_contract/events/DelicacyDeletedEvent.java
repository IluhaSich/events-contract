package com.example.events_contract.events;

import java.io.Serializable;

public class DelicacyDeletedEvent implements Serializable {
    private Long delicacyId;

    public DelicacyDeletedEvent(Long delicacyId) {
        this.delicacyId = delicacyId;
    }

    public Long getDelicacyId() {
        return delicacyId;
    }
}
