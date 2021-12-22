package de.uniba.dsam.task1.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
public class Actor {
    @Id
    private Long id;
    private String name;
    private boolean wonOscar;
    private LocalDate birthday;
}
