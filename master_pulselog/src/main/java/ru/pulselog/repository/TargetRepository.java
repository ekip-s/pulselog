package ru.pulselog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pulselog.model.target.Target;

import java.util.UUID;

@Repository
public interface TargetRepository extends JpaRepository<Target, UUID> {
}
