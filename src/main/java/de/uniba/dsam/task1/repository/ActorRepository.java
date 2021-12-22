package de.uniba.dsam.task1.repository;

import de.uniba.dsam.task1.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, String> {
}
