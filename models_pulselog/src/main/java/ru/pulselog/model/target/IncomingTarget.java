package ru.pulselog.model.target;

import lombok.*;
import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class IncomingTarget {

    private String name;
    private String description;
    private TargetType type;
    private BigDecimal initialValue;
    private BigDecimal targetValue;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IncomingTarget that = (IncomingTarget) o;
        return Objects.equals(name, that.name) && Objects.equals(description, that.description) && type == that.type && Objects.equals(initialValue, that.initialValue) && Objects.equals(targetValue, that.targetValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, type, initialValue, targetValue);
    }
}
