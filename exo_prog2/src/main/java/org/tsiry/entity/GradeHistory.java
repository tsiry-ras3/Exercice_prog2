package org.tsiry.entity;

import lombok.Data;
import lombok.Builder;
import java.time.LocalDateTime;

@Data
@Builder
public class GradeHistory {
    private LocalDateTime modificationDate;
    private double newValue;
    private String reason;
}
