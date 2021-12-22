package de.uniba.dsam.task1.repository;

import de.uniba.dsam.task1.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, String> {
}
