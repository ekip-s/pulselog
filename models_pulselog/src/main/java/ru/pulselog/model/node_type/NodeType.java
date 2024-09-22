package ru.pulselog.model.node_type;

import jakarta.persistence.*;
import lombok.*;
import ru.pulselog.model.target.Target;

import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="node_type")
public class NodeType {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @Column(name="title")
    private String title;
    @Column(name="description")
    private String description;
    @ManyToOne
    @JoinColumn(name = "target_id", nullable = false)
    private Target target;
}
