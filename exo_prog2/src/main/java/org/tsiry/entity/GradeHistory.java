package org.tsiry.entity;

import lombok.Data;
import lombok.Builder;

import java.time.Instant;
import java.time.LocalDateTime;

@Data
@Builder
public class GradeHistory {
    private Instant start;
    private double newValue;
    private String reason;
}
