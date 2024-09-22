package ru.pulselog.model.target_node;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import ru.pulselog.model.node_type.NodeType;
import ru.pulselog.model.target.Target;

import java.math.BigDecimal;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="target_node")
public class TargetNode {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @Column(name="value")
    private BigDecimal node_value;
    @ManyToOne
    @JoinColumn(name = "node_type_id", nullable = false)
    private NodeType nodeType;
    @ManyToOne
    @JoinColumn(name = "target_id", nullable = false)
    private Target target;
    @Column(name = "create_dt")
    @DateTimeFormat(pattern = "yyyy-MM-ddTHH:mm:ss")
    private LocalDateTime createDT;
}
