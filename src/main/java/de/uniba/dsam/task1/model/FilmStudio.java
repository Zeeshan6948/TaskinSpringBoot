package de.uniba.dsam.task1.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class FilmStudio {
    @Id
    private Long id;
    private String name;
    private Date since;
    //private List<Movie> movies;
}
