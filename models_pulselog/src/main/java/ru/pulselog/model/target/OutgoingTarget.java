package ru.pulselog.model.target;

import jakarta.persistence.Column;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OutgoingTarget {

    private UUID id;
    private String name;
    private String description;
    private TargetType type;
    private TargetStatus status;
    private BigDecimal initialValue;
    private BigDecimal targetValue;
    @DateTimeFormat(pattern = "yyyy-MM-ddTHH:mm:ss")
    private LocalDateTime createDT;
    @DateTimeFormat(pattern = "yyyy-MM-ddTHH:mm:ss")
    private LocalDateTime startDT;
    @DateTimeFormat(pattern = "yyyy-MM-ddTHH:mm:ss")
    private LocalDateTime endDT;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OutgoingTarget that = (OutgoingTarget) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(description, that.description) && type == that.type && status == that.status && Objects.equals(initialValue, that.initialValue) && Objects.equals(targetValue, that.targetValue) && Objects.equals(createDT, that.createDT) && Objects.equals(endDT, that.endDT);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, type, status, initialValue, targetValue, createDT, endDT);
    }
}
